package com.machinelearning.doc_classifier.knn.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.machinelearning.doc_classifier.document.Document;
import com.machinelearning.doc_classifier.document.DocumentCache;
import com.machinelearning.doc_classifier.knn.Utils;
import com.machinelearning.doc_classifier.knn.category_classifier.KNNCategoryClassifier;
import com.machinelearning.doc_classifier.knn.category_classifier.MajorityVoteClassifier;
import com.machinelearning.doc_classifier.knn.similarity.CosineSimilarity;
import com.machinelearning.doc_classifier.knn.similarity.DocumentSimilarityMethod;

public class KNNClassifier {

	private static final Logger logger = Logger.getLogger( KNNClassifier.class.getName() );
	
	private String categoryNames[];
	private int k;
	private int numberOfFalseClassified = 0;
	private int numberOfTrueClassified = 0;
	
	private ArrayList<String>business=new ArrayList<String>();
	private ArrayList<String>entertainment=new ArrayList<String>();
	private ArrayList<String>politics=new ArrayList<String>();
	private ArrayList<String>sport=new ArrayList<String>();
	private ArrayList<String>tech=new ArrayList<String>();
	
	private DocumentCache documentCache;
	
	private KNNCategoryClassifier categoryClassifier = new MajorityVoteClassifier();
	private DocumentSimilarityMethod documentSimilarityMethod = new CosineSimilarity();
	
	public KNNClassifier(String[] categoryNames, int k, DocumentCache documentCache) {
		this.categoryNames = categoryNames;
		this.k = k;
		this.documentCache = documentCache;
	}
	
	public KNNClassifier(String[] categoryNames, int k, DocumentCache documentCache, KNNCategoryClassifier categoryClassifier,DocumentSimilarityMethod documentSimilarityMethod) {
		this.categoryNames = categoryNames;
		this.k = k;
		this.documentCache = documentCache;
		this.categoryClassifier = categoryClassifier;
		this.documentSimilarityMethod = documentSimilarityMethod;
	}

	public void classify() {
		
		Set<String> testDocuments = documentCache.getTestDocumentNames();
		for(String testDocumentName : testDocuments) {
			long startTime = System.currentTimeMillis();
			
			Document testDocument = documentCache.getTestDocument(testDocumentName);
			List<KNNClassificationInfo> results = new ArrayList<KNNClassificationInfo>();
			
			Set<String> trainDocumentNames = documentCache.getTrainDocumentNames();
			for(String trainDocumentName : trainDocumentNames) {
				Document trainDocument = documentCache.getTrainDocument(trainDocumentName);
				double similarity = documentSimilarityMethod.calculateSimilarity(testDocument,trainDocument);
				
				KNNClassificationInfo classifierResult = new KNNClassificationInfo(trainDocumentName,
						Utils.getCategoryFromFileName(testDocumentName),
						Utils.getCategoryFromFileName(trainDocumentName),
						similarity);

				results.add(classifierResult);
				
			}
		//System.out.println(results+"\n");
			String estimatedCategory = categoryClassifier.estimate(results,categoryNames,k);
			checkEstimation(estimatedCategory,testDocumentName);

			//System.out.println("Document \t "+testDocumentName+ "\t classified as \t "+estimatedCategory);
			if(estimatedCategory.equals("business")){
				business.add(testDocumentName);
			}
			else if(estimatedCategory.equals("entertainment")){
				entertainment.add(testDocumentName);
			}
			else if(estimatedCategory.equals("politics")){
				politics.add(testDocumentName);
			}
			else if(estimatedCategory.equals("sport")){
				sport.add(testDocumentName);
			}
			else if(estimatedCategory.equals("tech")){
				tech.add(testDocumentName);
			}
			long stopTime = System.currentTimeMillis();
		    long elapsedTime = stopTime - startTime;
		  
		    //System.out.println(testDocumentName+ "  classified in"+elapsedTime+"  ms");
		}
		
		printResults();
	}
	
	private void checkEstimation(String estimatedCategory,String documentName) {
		if(documentName.contains(estimatedCategory)) {
			numberOfTrueClassified++;
		}else{
			numberOfFalseClassified++;
		}
	}
	
	private void printResults() {
		
		double precision = 0.0d;
		if(numberOfFalseClassified == 0) {
			precision = 100.0d;
		}else if(numberOfTrueClassified == 0) {
			precision = 0.0d;
		}else {
			precision = (double)numberOfTrueClassified / (double)(numberOfTrueClassified + numberOfFalseClassified) * 100.0d;
		}
		String businesscat=Arrays.toString(business.toArray());
		System.out.println("Business Category");
		System.out.println("..................");
		System.out.println(businesscat);
		
		String entertainmentcat=Arrays.toString(entertainment.toArray());
		System.out.println("entertainment Category");
		System.out.println("..................");
		System.out.println(entertainmentcat);
		
		String politicscat=Arrays.toString(politics.toArray());
		System.out.println("politics Category");
		System.out.println("..................");
		System.out.println(politicscat);
		
		String sportcat=Arrays.toString(sport.toArray());
		System.out.println("Sport Category");
		System.out.println("..................");
		System.out.println(sportcat);
		
		String techcat=Arrays.toString(tech.toArray());
		System.out.println("Technology Category");
		System.out.println("..................");
		System.out.println(techcat);
		logger.log(Level.INFO,"+: \t {0} \t -: \t {1} \t precision: \t %{2}" ,new Object[]{numberOfTrueClassified,numberOfFalseClassified,precision});
	}
}
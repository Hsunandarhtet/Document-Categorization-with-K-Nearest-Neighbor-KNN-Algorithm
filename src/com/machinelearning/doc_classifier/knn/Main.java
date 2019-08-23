package com.machinelearning.doc_classifier.knn;

import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;

import com.machinelearning.doc_classifier.document.DocumentCache;
import com.machinelearning.doc_classifier.document.FileDocumentCache;
import com.machinelearning.doc_classifier.knn.core.KNNClassifier;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		//JFileChooser j = new JFileChooser();
	     //j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	     //j.showOpenDialog(j);

	     String dirName = "E:\\New folder\\My File\\doc_classifier_knn-master\\data3";
	     //File dir = new File(j.getSelectedFile().getAbsolutePath());
		//String dirName = dir.toString();
		String []categoryNames = {"business","entertainment","politics","sport","tech"};
		int numberOfFilesToTrainForEachCategory = 2;
		int k=3;
		
		
		
		File directoryOfFiles = new File(dirName);
		DocumentCache documentCache = new FileDocumentCache(categoryNames, directoryOfFiles, numberOfFilesToTrainForEachCategory);		
		documentCache.cacheTrainingDocuments();
		documentCache.cacheTestDocuments();	
		
		KNNClassifier nc = new KNNClassifier(categoryNames, k, documentCache);
		nc.classify();
	}
}

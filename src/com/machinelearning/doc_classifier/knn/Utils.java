package com.machinelearning.doc_classifier.knn;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {
	
	public final static FileFilter getFileFilterForCategory(String categoryName) {
		FileFilter ff = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				
				if(pathname.getName().startsWith(categoryName) && pathname.getName().toLowerCase().endsWith("txt")) {
					System.out.print(pathname.getName());
					return true;
				}
				return false;
			}
		};
		
		return ff;
	}
	
	public final static File[] getAllTrainFiles(String[] categoryNames,File directoryOfFiles,int numberOfFilesToTrainForEachCategory) {
		List<File> result = new ArrayList<File>();
		for(String categoryName : categoryNames) {
			FileFilter ff = Utils.getFileFilterForCategory(categoryName);		
			File[] categoryFiles = directoryOfFiles.listFiles(ff);
			Arrays.sort(categoryFiles, new FileComparator());
			categoryFiles = (categoryFiles.length > numberOfFilesToTrainForEachCategory) ? ((File[]) Arrays.copyOfRange(categoryFiles, 0, numberOfFilesToTrainForEachCategory) ) : categoryFiles;
			
			result.addAll( new ArrayList<File>(Arrays.asList(categoryFiles)) );
		}
					
		return result.toArray(new File[result.size()]);
	}
	
	public final static File[] getAllTestFiles(String[] categoryNames,File directoryOfFiles,int numberOfFilesToTrainForEachCategory) {
		List<File> result = new ArrayList<File>();
		
		for(String categoryName : categoryNames) {
			
			FileFilter ff = Utils.getFileFilterForCategory(categoryName);
			File[] categoryFiles = directoryOfFiles.listFiles(ff);
			Arrays.sort(categoryFiles, new FileComparator());
			System.out.print(ff);
			if(categoryFiles.length>2){
				categoryFiles = Arrays.copyOfRange(categoryFiles , numberOfFilesToTrainForEachCategory, categoryFiles.length);
			}
			else{
				System.out.println("There is not enough documents to train for "+categoryName+" category.");
			
			}
			result.addAll( new ArrayList<File>(Arrays.asList(categoryFiles)) );
			
		}
		/*}catch(Exception e){
			System.out.println("There is not enough documents to train.");
		}*/	
		if(result.size()==0){
			System.out.println("There is no text file!\n");
		}
		return result.toArray(new File[result.size()]);
	}
	
	public static String getCategoryFromFileName(String fileName) {
		return fileName.split("-")[0];
		
	}
}

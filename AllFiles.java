package com.simplilearn.project;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;


// This module will return all the files in the directory in ascending order by name

public class AllFiles extends WelcomePage {

	public void ascend() {
		
		File dir = new File("C:\\Users\\DELL\\eclipse-workspace\\Phase1- DataStructure\\bin\\com\\simplilearn");
		 
		if(dir.isDirectory())
	    {
	      // Fetching the list from the directory
	      File[] files = dir.listFiles();

	      FileFilter fileFilter = new FileFilter()
	      {
	       
	        public boolean accept(File file) {
	          return !file.isDirectory();
	        }
	      };
	   
	   files = dir.listFiles(fileFilter);
	   

	      // Sort files by name
	      Arrays.sort(files, new Comparator()
	      {
	      
	        public int compare(Object f1, Object f2) {
	          return ((File) f1).getName().compareTo(((File) f2).getName());
	        }
	      });

	      //Prints the files in file name ascending order
	      System.out.println("All files in the directory ");
	      System.out.println("----------------------------------");

	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      
	      callingMethod(); 

	
	  }
	}
}

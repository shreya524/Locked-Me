package com.simplilearn.project;

import java.io.File;
import java.util.Scanner;

//This module searches the file from the directory

public class SearchFile extends WelcomePage{

	
	 public void Search() {
		   
		  
			Scanner input = new Scanner(System.in);
				
				System.out.println("Please enter the file name: ");
				String dname = input.nextLine();
		
				
				File fobj = new File("C:\\Users\\DELL\\eclipse-workspace\\Phase1- DataStructure\\bin\\com\\simplilearn\\"+dname+".txt");           
		
				boolean exists = fobj.exists();
				System.out.println(exists);
				
				if(exists = true) {
					
					System.out.println("file found below is the path: "); 
					System.out.println(fobj); 
					 
					callingMethod();
				}
					
					else {
						System.out.println("File Not Found");
						
						callingMethod();
					}
					
					
					
}
	
		
				}


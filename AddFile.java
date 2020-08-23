package com.simplilearn.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


//This module will add new files to the directory and will throw error if the file already exists

public class AddFile extends WelcomePage {
	
	public void AddingFile() {
		  Scanner input = new Scanner(System.in);
	
	      System.out.println("Please enter the file name: ");
	      String fname = input.nextLine();
// File path
	      File fObj = new File("C:\\Users\\DELL\\eclipse-workspace\\Phase1- DataStructure\\bin\\com\\simplilearn\\"+fname+".txt");
		
	try {
		boolean status = fObj.createNewFile();
		if(status) {
			
			System.out.println("File created: "+fObj.getName());
				
			callingMethod();
		}
		else {
			System.out.println("File already exist by name : "+fObj.getName());
			callingMethod();
		}
	} catch (IOException e) {
		
		System.out.println("An error occured");
		
		e.printStackTrace();
	}
	
	
	
}

}
package com.simplilearn.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//This module delete the file from the directory

public class DeleteFile extends WelcomePage {

	
		    public void DeleteFile() {
	   
			  
			Scanner input = new Scanner(System.in);
				
				System.out.println("Please enter the file name: ");
				String dname = input.nextLine();
		
				
				File fobj = new File("C:\\Users\\DELL\\eclipse-workspace\\Phase1- DataStructure\\bin\\com\\simplilearn\\"+dname+".txt");           
		
				boolean exists = fobj.exists();
				System.out.println(exists);
				
				if(exists = true) {
					if(fobj.delete())                       
					{  
					System.out.println("File removed"); 
					 
					callingMethod();
					}
					else {
						System.out.println("File Not Found");
						
						callingMethod();
					}
					
					
					
}
	
		
				}
		    }



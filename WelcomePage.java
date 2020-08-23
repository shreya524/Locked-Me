package com.simplilearn.project;

import java.util.Scanner;

public class WelcomePage extends Main {
	
	public void welcome() {
	    try (Scanner input = new Scanner(System.in)) {
			System.out.println("----------------------------");
			System.out.println("|   Welcome to LockedMe    |");
			System.out.println("----------------------------");
   
			
			
			System.out.println("|                 MAIN MENU                                             |");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("|     1. Return the current file names in ascending order               |");
			System.out.println("|     2. Add a file to the existing directory list                      |");
			System.out.println("|     3. Delete a user specified file from the existing directory list  |");
			System.out.println("|     4. Search a file                                                  |");
			System.out.println("|     5. Close the application                                          |");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("|     Enter your option :                                               |");
  
			
			int choice = input.nextInt();
//	    System.out.println(choice);   --- only for debugging
			
			switch (choice) {
			case 1:
				//System.out.println(choice);
				AllFiles allobj = new AllFiles();
				allobj.ascend();
			    break;
			case 2:
				//System.out.println(choice);
				AddFile addobj = new AddFile();
				addobj.AddingFile();
			  break;
			case 3:
				//System.out.println(choice);
				DeleteFile delobj = new DeleteFile();
				delobj.DeleteFile();
			      break;
			case 4:
				//Add a code to search a file name
				SearchFile srobj = new SearchFile();
				srobj.Search();
			      break;
			case 5:
				
				System.out.println("Thank you --  Application exited");
				System.exit(0);
				
			      break;
   
			default:
			  System.out.println("Please select the options from the main menu");
			  break;
			}
		}
	   
	   

	    	}  
	
	public void callingMethod() {
		   System.out.println("Press 1 to close the application or Press 2 to return to main menu");
		    Scanner input = new Scanner(System.in);
	    	System.out.println("Please enter your choice ");
	    	int option = input.nextInt();
	    	
	    	 switch (option) {
	    	    case 1:
	    		
	    	    	System.out.println("Thank you --  Application exited");
	    	    	System.exit(0);
	    	        break;
	    	        
	    	    case 2:
	    	    	/*  Add a code to call the main screen*/
	    	    	welcome();
	    	      break;
	    	      }
	 }
	    
	
}

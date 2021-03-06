package com.LockedMe;

import java.util.Scanner;
import java.io.IOException;


public class LockedMeScreen {
	public static void main(String[] args) throws IOException {
		int ch=0, choice=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("**********************************************");
		System.out.println("\t Welcome to LockedMe.com ");
		System.out.println("\t By: Lockers Pvt.Ltd ");
		System.out.println("\t Developer: Warona Lekoba\n");
		System.out.println("**********************************************");
		
		while(true)
		{
			System.out.println("Please select one of the following options :");
			System.out.println("1. List Current Files");
			System.out.println("2. File Operations");
			System.out.println("3. Close Application");
			try{    
				ch = sc.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("Null Exception occurred");  
             }         
			
			switch(ch)
			{
			case 1: //List function feature to list all files in ascending order.
				FileOperations.listFiles();
				break;
			case 2:
				
					System.out.println("Please choose one of the following options :");
					System.out.println("1. Add a File");
					System.out.println("2. Delete a File");
					System.out.println("3. Search for a File");
					try{    
						 choice = sc.nextInt();
					}
					catch(Exception e)  
	                  {  
	                   System.out.println("Null Exception occurred");  
	                  }          
					switch(choice)
					{
					case 1:
						//Creation of a file takes place
						System.out.println("Please input file name to be created: ");
						String fileCreate = sc.next();
						
						// Calling the function to create the file
						FileOperations.createFile(fileCreate);
						break;
						
					case 2:
						//deletion of the file
						System.out.print("Please input file name to be deleted: ");
						String fileDelete = sc.next();
						
						// Calling the function to delete the file
						FileOperations.deleteFile(fileDelete);
						break;
					case 3:
						//Search for the file
						System.out.println("Please input file name to be searched: ");
						String fileSearch = sc.next();
						
						// Calling the function to search the file
						FileOperations.searchFile(fileSearch);
						break;
						
				default:
						//In the case of unprecedented input execute this
						System.out.println("\n Oops! Invalid Input, please repeat\n");
						break;
				}
			
					break;
			case 3:
				
				//Voluntarily exiting the application
				sc.close();
				System.out.println("\n Thank you for using LockedMe! Until next time...");
				System.exit(1);
				break;
			
			default:
				//In the case of unprecedented input execute this
				System.out.println("\n\n Oops! Invalid Input, Select within the range of 1-3\n");
				break;
			
			}
		}
		
	}


}

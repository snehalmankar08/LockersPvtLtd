//package LockedMe.com;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class locker  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Developer Name: SNEHAL MANKAR");
		System.out.println("Project Name: LockedMe.com");
		System.out.println("------------------------");
		int option=0;
		while(true)
		{
		System.out.println("OPTIONS");
		System.out.println("1. Press 1 for List the fies in ascending order");
		System.out.println("2. press 2 for Detailed option");
		
		System.out.println("3. Press 3 inorder to Close the application");
		try
		{
		System.out.println("Please selcet the option");
		Scanner scr=new Scanner(System.in);
		option= scr.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Please enter integer input");
		}
		
		switch(option)
		{
		case 1: System.out.println();
		System.out.println(); 
		System.out.println("list of files in ascending order");
		File filedir=new File("C:\\Users\\smank\\eclipse-workspace\\LockersPvtLtd\\lockedmefiles");
		if(filedir.isDirectory())
		{
			List listfile=Arrays.asList(filedir.list());
			Collections.sort(listfile);
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in ascending order");
			for(Object s: listfile){
				System.out.println(s);
			}
		}
		
		break;
				
		case 2: System.out.println("===========================");
				System.out.println("===========================");
				
				System.out.println("Select any of the following option");
				
				System.out.println("a. Press a to Add file to the existing directory");
				System.out.println("b. Press b to Delete the file from existing directory");
				System.out.println("c. Press c to search for the file");
				System.out.println("d. Press d in order to return to main menu");
			char c=' ';
		
				Scanner input=new Scanner(System.in);
				c = input.next().charAt(0);
			
			if(c=='a')
				{
					System.out.println("adding a file");
					System.out.println("Enter the file name to be inserted");
					
					Scanner input1=new Scanner(System.in);
					String newfile=input1.nextLine();
					File f1=new File("C:\\Users\\smank\\eclipse-workspace\\LockersPvtLtd\\lockedmefiles");
					if(f1.exists())
					
					{
						System.out.println(f1 +"file already exist");
						
					}
					else
					{
						f1.createNewFile();
						System.out.println("File created");
					
					}
						
					
				}
				else if(c=='b')
				{
					System.out.println("deleting a file");
					System.out.println("Enter the file name to be dele2ted");
					Scanner input2=new Scanner(System.in);
					String newfile=input2.nextLine();
					File f1=new File("C:\\Users\\smank\\eclipse-workspace\\LockersPvtLtd\\lockedmefiles",newfile);
					
					 if (f1.delete()) {
				            System.out.println(f1 +"File deleted successfully");
				        }
				        else {
				            System.out.println("Failed to delete the file");
				        }
						
					
				}
				else if(c=='c')
				{
					System.out.println("Search for a file");
					File directory = new File("C:\\Users\\smank\\eclipse-workspace\\LockersPvtLtd\\lockedmefiles");

				    
				     String[] flist = directory.list();
				     System.out.println("Enter the file name to be searched");
				     Scanner filename1=new Scanner(System.in);
				    String filename2=filename1.next();
				     int flag = 0;
				     if (flist == null) {
				         System.out.println("Empty directory.");
				     }
				     else {

				         // Linear search in the array
				         for (int i = 0; i < flist.length; i++) {
				             String filename = flist[i];
				             if (filename.equalsIgnoreCase(filename2)) {
				                 System.out.println(filename + " found");
				                 flag = 1;
				             }
				         }
				     }

				     if (flag == 0) {
				         System.out.println("File Not Found");
				     }
				 }
					
					
				
				else if(c=='d')
				{
					continue;
				}
				else
				{
					System.out.println("Please enter either a or b or c");
					continue;
				}
				
			break;
				
				
		case 3: System.exit(1);
				break;
		default: System.out.println("Enter the valid input that is 1 or 2 or 3");
					break;
				

				
		}
	}
		
		
		
	}		
}
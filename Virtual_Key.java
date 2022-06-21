package assignment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Virtual_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   welcome();
	  create_file();
	  create_dir();

	}

	private static void create_dir() {
		// TODO Auto-generated method stub

		

		
		boolean dirFlag = false;
        System.out.println("enter the directory\n");
        Scanner sc=new Scanner(System.in);
        String f_name=sc.next();
		File stockDir = new File("/home/kalparajashekar/Documents/f_name ");

		try {
		   dirFlag = stockDir.mkdir();
		} catch (SecurityException Se) {
		System.out.println("Error while creating directory in Java:" + Se);
		}

		if (dirFlag)
		   System.out.println("Directory created successfully");
		else
		   System.out.println("Directory was not created successfully");
		}
		


		
	private static void create_file() {
		// TODO Auto-generated method stub
		
		
		boolean flag = false;

		// create File object
		File stockFile = new File("/home/kalparajashekar/Documents/stockFile.txt");

		try {
		    flag = stockFile.createNewFile();
		} catch (IOException ioe) {
		     System.out.println("Error while Creating File in Java" + ioe);
		}

		System.out.println("stock file" + stockFile.getPath() + " created ");

		}
		


		
			
	

	private static void welcome() {
		// TODO Auto-generated method stub
		System.out.println("\n***********************************************************************************************************************************************\n");
        System.out.println("\t\t\t\t\t\t\t\tWelcome to The Desk \t\t\t\t\t\t\t\n");
        System.out.println("*************************************************************************************************************************************************\n");
	}

}

package assignment;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;



public class v_key {
	  
    // Main Driver Method
    public static void main(String args[])
    {
        // Creating New File via function
    	optionsSelection();
        
         
         //gfg.delFile();
    }
  
    private static void optionsSelection() {
		// TODO Auto-generated method stub

        
       
        	int[] arr = {1,2,3,4,5};
            int  slen = arr.length;
            
                // display the all the Strings mentioned in the String array
            String[] arr1 = {"1.  To add a user specified file",
                    "2. To delete a user specified file",
                    "3. To sort the files",
                    "4. To search for a particular file",
                    "5. Close the application"};
            for(int i=0; i<arr.length;i++)
                System.out.println(arr1[i]);
                    System.out.println("\nEnter your choice:\t");
            Scanner sc = new Scanner(System.in);
            int  options =  sc.nextInt();
            
            
            
            for(int j=1;j<=slen;j++){
                if(options==j){
                    switch (options){
                        case 1:
                            System.out.println("You are in the file adding path \n");
                            v_key afile = new v_key();
                            afile.newFile();
                             optionsSelection();
                            break;
                        case 2:
                        	System.out.println("You are in the file deleting path \n");
                            v_key dfile = new v_key();
                            dfile.delFile();
                            System.out.println("file  deleted \n");
                             optionsSelection();
                            break;
                        case 3:
                        	System.out.println("You are in the file sorting  path \n");
                            v_key sofile = new v_key();
                           // sofile.sortingFile();
                            sofile.ascFile();
                             optionsSelection();
                            break;
                        case 4:
                        	System.out.println("You are in the file sorting  path \n");
                            v_key srcfile = new v_key();
                           // sofile.sortingFile();
                            srcfile.srcFile();
                             optionsSelection();
                            break;
                            
                            
                    }
                }
            }
	}

	private void srcFile() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner( System.in );
		List<String> list=new ArrayList<String>();  
        System.out.println("Enter the file name: ");
        String pattern;
       
		String f_name=scanner.nextLine();
        System.out.println("Enter the path: ");
        //Scanner scanner1 = new Scanner( System.in );
        String dirPath = scanner.nextLine(); // Takes the directory path as the user input
       // File file_name = new File(dirPath);
        File directory = new File(dirPath);
        
        // Create an object of Class 
        // Constructor with name of file which is being
        // searched
        
        String[] flist = directory.list();
        
        // Empty array
        if (flist == null) {
            System.out.println(
                "Empty directory or directory does not exists.");
        }
        else {
  
            // Print all files with same name in directory
            // as provided in object of
            // class
        	int mark=0;
            for (int i = 0; i < flist.length; i++)
            {
            	 
            	if(flist[i].equalsIgnoreCase(f_name))
            	{
            		 
            		
                  System.out.println(flist[i]+" found");
                  mark=1;
                  
                }
            	
            		
            }
            if(mark!=1)
            		 System.out.println("file not found\n");
        }
    }

		
		
	

	private void ascFile() {
		
		Scanner scanner = new Scanner( System.in );
		List<String> list=new ArrayList<String>();  
        System.out.println("Enter the file path: ");
        String dirPath = scanner.nextLine(); // Takes the directory path as the user input
        File fileDir = new File(dirPath);
        File root = new File(dirPath);
        int j=0;
        File[] files = root.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return !file.isHidden();                                         
            }
        });
       
       
        
        String [] fileNames= new String[files.length];
        for (int i = 0; i < files.length; i++) 
        {
          fileNames[i] = files[i].getName();
         
       }
       
        
        if(fileDir.isDirectory())
        {
        final List<String> list2 = new ArrayList<>(Arrays.asList(fileNames));
        Collections.sort(list2, String.CASE_INSENSITIVE_ORDER);
     	//Collections.sort(list2);
		System.out.println("---------------------------------------");
		System.out.println("Sorting by filename in ascending order\n");
		for(String s:list2){
			System.out.println(s);
		}
                     
		}
		else{
			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
		}

	}


    
		

	                
private void delFile() {
		// TODO Auto-generated method stub
    	String strPath="",strName="";
    	//try-catch Block
    	try {
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		System.out.println("Enter the file name to be deleted:");
    		//reading filename;
    		strName=br.readLine();
    		//reading filepath
    		System.out.println("Enter the path to be deleted:");
    		strPath=br.readLine();
    		 File file1  = new File(strPath + "" + strName + ".txt");
    		 file1.delete();
    		
    	}
    	catch (Exception ex1) {
        }
		
	}

	// Function To Make New File
    public void newFile()
    {
        String strPath = "", strName = "";
  
        // Try-catch Block
        try {
  
            // Creating BufferedReadered object
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            System.out.println("Enter the file name:");
  
            // Reading File name
            strName = br.readLine();
            System.out.println("Enter the file path:");
  
            // Reading File Path
            strPath = br.readLine();
  
            // Creating File Object
            File file1  = new File(strPath + "" + strName + ".txt");
  
            // Method createNewFile() method creates blank
            // file.
            file1.createNewFile();
            System.out.println("created a file");
        }
  
        // Try-Catch Block
        catch (Exception ex1) {
        }
    }
}
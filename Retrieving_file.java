package assignment;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Retrieving_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=new File("/home/kalparajashekar/Documents/");
        File[] file=dir.listFiles();
       ArrayList<String> arr=new ArrayList();
        
        int arr_length=0;
        
     Arrays.sort(file, (f1, f2) -> f1.compareTo(f2));
     System.out.println("**********************");
     
     System.out.println("**********************");
     
     if (file!= null) {
       for (File child : file) {
         // Do something with child
    	  // System.out.println("files"+file.);
       }
     } 
        for(File f:file)
        {int i=0;
        	 if(!f.isHidden())
        		 if(f.isDirectory())
        		 {
        			 System.out.println("Dir\t "+f.getName());
        			 
        		 }
        		 else
        		 {
        			 System.out.println("File\t "+f.getName());
        			 String f_name=f.getName();
        			 arr.add(f_name);
        		
        	        		 }
        }
        System.out.println("-----------------------");
        for (int i=0;i<arr.size();i++)
             	System.out.println(arr.sort());
        Arrays.sort( file, new Comparator<File>() {
            public int compare( File a, File b ) {
				return 0;
                // do your comparison here returning -1 if a is before b, 0 if same, 1 if a is after b
            }
        } );
        //Files.list(Paths.get(dir)).sorted().forEach(System.out::println);
	}

}

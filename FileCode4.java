package FileOperation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileCode4 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		modifyFile("/home/kalparajashekar/Documents/test3.txt","text","best");
        System.out.println("done");
	}

	private static void modifyFile(String filepath, String oldstring, String newstring)
	{
		// TODO Auto-generated method stub
		
      File  filetobemodified=new File(filepath);
      String oldcontent="";
      BufferedReader reader=null;
      FileWriter writer =null;
      try {
    	  reader=new BufferedReader(new FileReader(filetobemodified));
    	  String line=reader.readLine();
    	  while(line!=null)
    	  { oldcontent=oldcontent+line+System.lineSeparator();
    	    line=reader.readLine();
    	    
    	  }
    	  
    	  
    	  
    	  String newcontent=oldcontent.replaceAll(oldstring,newstring);
    	  writer=new FileWriter(filetobemodified);
    	  writer.write(newcontent);
      }catch(IOException e)
      {
    	  e.printStackTrace();
      }
      
      
      
      finally {
    	  try {
    		  reader.close();
    		  writer.close();
    	  }
    	  catch(IOException e)
    	  {
    		  e.printStackTrace();
    	  }
      }
		
	}

}

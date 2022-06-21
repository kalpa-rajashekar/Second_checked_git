package FileOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class File_handling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//creating the file
		createfileusingclass();
		System.out.println("Lets read the data\n");
		
		//reading the file
		List l=readfileinlist("/home/kalparajashekar/Documents/READINGFILE.txt");
		Iterator <String> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//System.out.println("ELEMENT IS"+itr);
		}
     
		//writing intofile
		writing_into_file("/home/kalparajashekar/Documents/WRITINGFILE.txt");
		append_to_file("/home/kalparajashekar/Documents/WRITINGFILE.txt");
	}

	private static void append_to_file(String filename)
	{
		// TODO Auto-generated method stub
		String str="\t This is the appened string. Am appending text at the end of the file(WRITING.txt) \n";
		try 
		{
		BufferedWriter out=new BufferedWriter(new FileWriter(filename,true));
	
		 out.write(str);
		out.close();
		
		}
		catch(IOException e)
		{
			System.out.println("Exception occured"+e);
		}
		
			
	}

	private static void writing_into_file(String filename) throws IOException 
	{
		// TODO Auto-generated method stub
		FileWriter Writer =new FileWriter(filename);
		Writer.write("Am doing write into the file");
		System.out.println("----------------------");
		Writer.close();
		
		
		
	}

	private static List readfileinlist(String fileName)
	{
		// TODO Auto-generated method stub
		List<String> lines=Collections.emptyList();
		try {
			lines=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
			//System.out.println("lines are"+lines);
		
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
			
	
		return lines;
	}

	private static void createfileusingclass() throws IOException 
	{
		// TODO Auto-generated method stub
		File file=new File("/home/kalparajashekar/Documents/CREATINGFILE.txt");
		if(file.createNewFile()==true)
		{
			System.out.println("file created");
		}
		else
		{
			System.out.println("file already exists");
		}
		//FileWriter Writer=new FileWriter(file);
		
		
	}
	

}

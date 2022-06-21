package FileOperation;
import java.io.File;
import java.io.FileOutputStream;
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
public class FileCode3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List l=readFileInList("/home/kalparajashekar/Documents/testFile2.txt");
		Iterator<String> it=l.iterator();
		while(it.hasNext())
		{
	      System.out.println(it.next());
			
		}

	}

	private static List readFileInList(String fileName) {
		// TODO Auto-generated method stub
		List<String> lines=Collections.emptyList();
		try {
			lines=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
				
		    }
		catch(IOException e)
		{ 
			e.printStackTrace();
		}
		return lines;
			
	}

}

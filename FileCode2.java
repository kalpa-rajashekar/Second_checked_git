package FileOperation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;


public class FileCode2 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		createFileUsingOutputStreamClass();

	}

	private static void createFileUsingOutputStreamClass() throws IOException 
	{
		// TODO Auto-generated method stub
		String data="textdata";
		FileOutputStream out=new FileOutputStream("/home/kalparajashekar/Documents/test3.txt");
		out.write(data.getBytes());
		out.close();
		
				
		
	}

}

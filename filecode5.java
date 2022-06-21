package FileOperation;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class filecode5
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		try
		{
			Files.deleteIfExists(Paths.get("/home/kalparajashekar/Documents/test3.txt"));
				
		}
		catch(NoSuchFileException e)
		{
			System.out.println("no such file or directory");
		}
		catch(DirectoryNotEmptyException e)
		{
			System.out.println(" directory is not empty");
		}
		catch(IOException e)
		{
			System.out.println("INvalid pemeission");
		}
		System.out.println("DELETTION SUCCESSFUL");
    }

}

package assignment;



import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ascending_order {

	
	public static void main(String[] args) {
		File fileDir = new File("first_set_demo");
		if(fileDir.isDirectory()){
			List<String> listf = Arrays.asList(fileDir.list());
			System.out.println("Listing files unsorted\n");
			for(String s:listf){
				System.out.println(s);
			}
			Collections.sort(listf);
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in ascending order\n");
			for(String s:listf){
				System.out.println(s);
			}
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in descending order\n");
			Collections.sort(listf,Collections.reverseOrder());
			for(String s:listf){
				System.out.println(s);
			}

		}
		else{
			
			
			
			
			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
		}

	}

}


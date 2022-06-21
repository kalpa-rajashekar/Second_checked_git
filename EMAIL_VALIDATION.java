package FileOperation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EMAIL_VALIDATION
{

    public static void main(String[] args)
    {
        int found=0;
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("dad.revanna@kadab.com");
        emailID.add("amma.vijaya@kadab.com");
        emailID.add("hus.raj@sand.com");
        emailID.add("daught.priaad@dot.com");
        emailID.add("henrik.fiesler@gmx.com");
        emailID.add("laura.kramm@gmx.com");
        emailID.add("sabine.neuwirth@gmx.com");
        
        
        
         // new code
         String  searcElement = null;
         System.out.println("Enter the email to search");
         Scanner sc = new Scanner(System.in);
         searcElement= sc.nextLine();
         
         
         
        // String regex = "^(.+)@(.+)$";
          String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
         Matcher matcher = Pattern.compile(regex).matcher(searcElement);
       
         if(matcher.matches())
         {
              System.out.println(" \nString  You have entered email_id is in valid email format\n");
   		 }
         else
         {
        	 System.out.println("String  You have entered  is not in valid email form");
         }
           for (String element : emailID)
           {
        	   if (element.contains(searcElement)&& matcher.matches())
        	   {
        	      System.out.println("ELEMENT FOUND\t"+element);
        	      found=1;
        	     // break;
        	   }
        	   
           }
             if(found==0)
             {
            	 System.out.println("ELEMENT NOT FOUND\t"); 
             }
     } 
}


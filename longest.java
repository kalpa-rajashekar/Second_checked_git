package assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class longest
{
	public static void main(String[] args) throws Exception
	{
		int i=1,j,k,l,m,n,p,q,r,s;
		//String str;
		
		ArrayList<Integer> long_sub=new ArrayList<Integer>();
		System.out.println("Enter the sequence\n");
		Scanner sc= new Scanner(System.in);
		
		
	        while(true)
	                { 
		     
		    	         sc.hasNext();
	                     k=sc.nextInt();
	                     if(k>0)
		    	         long_sub.add(k);
	                     else 
	            	     break;
		           			    
	      	          }
	    System.out.println(long_sub); 
	   ArrayList<Integer> result=new ArrayList<Integer>();
	   l=long_sub.get(0);
	   m=long_sub.get(1);
	   result.add(l);
	   if(m>l)
	     {
	    	 
	    	 System.out.println("................******************............");
	    	 s=long_sub.get(1);
	    	 
	    	 result.add(s);
	     }
	   for(int o=2;o<long_sub.size();o++)
	    	{  
		      if(long_sub.size()>=4)
		      {
		       System.out.println("/////////////////////////");
		       q=long_sub.get(o);
		       r=long_sub.get(o+1);
                   if(r>q)
                     {
                	     System.out.println("*********************");
                	     p=r;
   	                //     result.add(o,p);
                	
                      }
                      else {
            	     //   result.add(o,q);
            	   
                      }
		      }
		      else
		      {
		    	  System.out.println("*-------------*******************----------------------*");
		    	 // result.add(2);
		      }
		      
	        }
		//for(int index=0;index<(result.size());index++)
          //System.out.println(result.get(index));
}
		
			
	   
	}		
	
		
				
		
			/****************************************
		    
		    

}*//////////////////////////////////////

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class linked_ls{
	   static int incre_subseq(LinkedList<Integer> l1, int arr_len){
	      int seq_arr[] = new int[arr_len];
	      int i, j, max = 0;
	      for (i = 0; i < arr_len; i++)
	         seq_arr[i] = 1;
	      for (i = 1; i < arr_len; i++)
	      for (j = 0; j < i; j++)
	      if (l1.get(i) > l1.get(j)&& seq_arr[i] < seq_arr[j] + 1)
	      seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < arr_len; i++)
	      if (max < seq_arr[i])
	      max = seq_arr[i];
	      return max;
	   }



	public static void main(String[] args) {
		int k,m,n,p=0;
		// TODO Auto-generated method stub
		
		      
		LinkedList<Integer> l1=new LinkedList<Integer>();
		System.out.println("Enter the sequence and enter ZERO for end of input\n");
		Scanner sc= new Scanner(System.in);
		
		
	        while(true)
	                { 
		     
		    	         sc.hasNext();
	                     k=sc.nextInt();
	                     if(k>0)
		    	         l1.add(k);
	                     else 
	            	     break;
		           			    
	      	          }
	    System.out.println(l1); 
	    int size=l1.size();
	    System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(l1, size));
		   
	   
	}

}

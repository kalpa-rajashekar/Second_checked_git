import java.util.Scanner;

public class struct_long{
		   static int incre_subseq(int my_arr[], int arr_len){
		      int seq_arr[] = new int[arr_len];
		      int i, j, max = 0;
		      for (i = 0; i < arr_len; i++)
		         seq_arr[i] = 1;
		      for (i = 1; i < arr_len; i++)
		      for (j = 0; j < i; j++)
		      if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1)
		      seq_arr[i] = seq_arr[j] + 1;
		      for (i = 0; i < arr_len; i++)
		      if (max < seq_arr[i])
		      max = seq_arr[i];
		      return max;
		   }
		   public static void main(String args[])
		   {
			   int my_arr[] = null;
			   int k=0,n=0;
			   System.out.println("enter how mmany numbers forentering  and zero for exit\n");
			   
			   Scanner sc= new Scanner(System.in);
			  // sc.nextInt();
			   int j=1;
			   while( j!=0)
			   {  
				   if(j>0)
			      {
				  k=sc.nextInt() ;
				  j=k;
				  my_arr[n]=k;
				  n++;
			      }
				  else
				   System.out.println("exit exit\n");
	
			   }
			   
		     // int my_arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		      int arr_len = my_arr.length;
		      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(my_arr, arr_len));
		   }

}

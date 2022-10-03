//Pgrm 5
/* 5. Sort a given set of n integer elements using Quick Sort method and compute its time
complexity. Run the program for varied values of n &gt; 5000 and record the time taken to
sort. Plot a graph of the time taken versus n on graph sheet. The elements can be read
from a file or can be generated using the random number generator. Demonstrate using
Java how the divide-and-conquer method works along with its time complexity analysis:
worst case, average case and best case */


import java.util.Scanner;
import java.util.Random;

public class Pgrm5 
{	
	static int max = 30000;
	
	static void quick_sort(int a[], int low, int high)
	{
	  int k;
	  
	  if(low < high)
	  {
	    k = partition(a,low,high);
	    
	    quick_sort(a,low,k-1);
	    quick_sort(a,k+1,high);
	  }
	}
	
	
	static int partition(int a[], int low, int high)
	{
	  int i = low;
	  int j = high;
	  
	  int key = a[low];
	  
	   while(i <= j)
	   {
	      while(a[i] <= key)
	    	  i++;
	      
	      while(a[j] > key)
	    	  j--;
	     
	     
	     if(i < j)
	    	 exchange(a,i,j);
	   }
	  
	   exchange(a,low,j);
	  
	   return j;
	}
	
	static void exchange(int a[],int i, int j)
	{
	  int temp;
	  
	  temp = a[i];
	  a[i] = a[j];
	  a[j] = temp;	  
	}
	
		
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  Random r = new Random();
	  
	  int a[] = new int[max];
	  int i;
	  
	  long start,end;
	  
	  
	  System.out.println("Enter the no. of Elements: ");
	  int n = sc.nextInt();
	  
	  for(i=0; i<n; i++)
		  a[i] = r.nextInt(100);
	  
	  System.out.println("Random Elements of Array: ");
	  for(i=0; i<n; i++)
		  System.out.print(a[i]+ "\t");
	  
	  System.out.println("");
	  
	  a[n] = 9999;
	  
	  start = System.nanoTime();
	  quick_sort(a,0,n-1);
	  end = System.nanoTime();
	  
	  System.out.println("Sorted Array Elements: ");
	  for(i=0; i<n; i++)
		  System.out.print(a[i]+ "\t");
	  
	  System.out.println("");
	  
	  System.out.println("Time taken to Sort = " +(end - start)+ " ns");
	  sc.close();
	}
}

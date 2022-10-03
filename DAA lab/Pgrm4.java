//Pgrm 4
/* 4 Sort a given set of n integer elements using Merge Sort method and compute its time
complexity. Run the program for varied values of n &gt; 5000, and record the time taken
to sort. Plot a graph of the time taken versus n on graph sheet. The elements can be read
from a file or can be generated using the random number generator. Demonstrate using
Java how the divide-and-conquer method works along with its time complexity analysis:
worst case, average case and best case.*/

import java.util.Scanner;
import java.util.Random;

public class Pgrm4 
{  
	static int max = 30000;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int a[] = new int[max];
		int i;
		
		long start, end;
		
		System.out.println("Enter the number of elements of Array: ");
		int n = sc.nextInt();
		
		
		for(i=0; i<n; i++)
			a[i] = r.nextInt(100);
		
		System.out.println("Array Elements are: ");
		
		for(i=0; i<n; i++)
		{
		  System.out.print(a[i]+ "\t");
		}
		System.out.println("");
		
		start = System.nanoTime();
		
		merge_sort(a, 0, n-1);
		
		end = System.nanoTime();
		
		
		System.out.println("Sorted Array Elements are: ");
		for(i=0; i<n; i++)
		{
		  System.out.print(a[i]+ "\t");
		}
		System.out.println("");
		
		System.out.println("Time taken to Sort = " +(end - start)+ " ns");
		
	}
	
	static void merge_sort(int a[], int low, int high)
	{
	   int mid;
	   
	   if(low < high)
	   {
		 mid = (low + high)/2;
		 
		 merge_sort(a, low, mid);
		 merge_sort(a, mid+1, high);
		 
		 merge(a, low, mid, high);	 
		 
	   }
	}

	static void merge(int a[], int low, int mid, int high)
	{
	  int i = low;
	  int j = mid+1;
	  int k = low;
	  int c[] = new int[max];
	  
	  while(i <= mid && j<= high)
	  {
		if(a[i] <= a[j])
		{
		  c[k] = a[i];
		  
		  i++;
		  k++;
		}
		
		else
		{
		  c[k] = a[j];
		  
		  j++;
		  k++;
		}
	  }
	  
	  while(i <= mid)
	  {
	    c[k] = a[i];
	    
	    i++;
	    k++;
	  }
	  
	  while(j <= high)
	  {
	    c[k] = a[j];
	    
	    j++;
	    k++;
	  }
	  
	  for(i = low; i <= high; i++)
	  {
	    a[i] = c[i];
	  }
	}
}

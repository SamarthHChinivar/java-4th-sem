//Program 10 (a).
/* 10(a). Write Java program to Implement All-Pairs Shortest Paths problem using Floyd's
          algorithm. */


import java.util.Scanner;

public class Pgrm10a 
{   
    // Instance Variables
	
	int n;
	int a[][] = new int [10][10]; // input    array
	int d[][] = new int [10][10]; // distance array
	
	
	void Read_Matrix() // Method to Read Cost Matrix
	{
	  Scanner sc = new Scanner(System.in);
	  
	  
	  System.out.println("Floyd's Algorithm :");
	  System.out.println("*******************");
	  System.out.println("");
	  
	  
	  System.out.println("Enter the Number of Nodes: ");
	  n = sc.nextInt();
	  
	  System.out.println("Enter the Nodes of Cost Adjacency Matrix: ");
	  
	  for(int i=1; i<=n; i++)
	  {
		for(int j=1; j<=n; j++)
		{
		  a[i][j] = sc.nextInt();
		}
	  }
	  
	  sc.close();
	}
	
	
	void Shortest_path() /* Method for finding Shortest Path using Floyd's Logic
	                                        (All Pair Shortest Path OR APST)*/
	{
      
	  for(int i=1; i<=n; i++)  
      { 
    	/* for loops to transfer the contents of a[][] into d[][] */ 
    	  
    	for(int j=1; j<=n; j++)
    	{
    	  d[i][j] = a[i][j];
    	}
      }
      
      
	  for(int k=1; k<=n; k++)
	  {
		 /* for loops to find shortest path of all pairs (APST) using Floyd's Logic */
		  
		 for(int i=1; i<=n; i++)
		 {
		   for(int j=1; j<=n; j++)
		   {
			 // Using Floyd's Logic
			 /* Floyd's Logic:
                (Transitive 3 pair) = Math.min{ (Transitive 3 pair)  ,  (Transitive Left pair) + (Transitive Right pair) }

                Then Math.min( ) returns the minimum value back  */
			   
			  d[i][j] = Math.min(d[i][j],  d[i][k] + d[k][j]);
		   }
		 } 
	  }
	  
	  
	  System.out.println("Resultant Shortest Path Matrix is shown below :");
	  System.out.println("***********************************************");
	  
	  for(int i=1; i<=n; i++)
	  {
		/* for loops to show output */
			
		for(int j=1; j<=n; j++)
		{
		  System.out.print(d[i][j]+ " ");
		}
		
		System.out.println("");
	  }
      
	  
	}
	
	
    public static void main(String[] args) 
	{
	  Pgrm10a F = new Pgrm10a();
	  
	  F.Read_Matrix();
	  
	  System.out.println("");
	  System.out.println("");
	  
	  F.Shortest_path();

	}

}

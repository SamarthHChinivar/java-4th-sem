//Program 9
/* 9. Find Minimum Cost Spanning Tree of a given undirected graph using Prim's algorithm. Implement the program in Java language. */


import java.util.Scanner;

public class Pgrm9 
{   
    // instance variables
	int n;
	int a[][] = new int [10][10];
	
	
	void Read_matrix()
	{
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Prim's Algorithm using Greedy Method:");
	  System.out.println("**************************************");
	  System.out.println("");
	  
	  System.out.println("Enter the Number of Nodes:");
	  n = sc.nextInt();
	  
	  System.out.println("Enter the Cost Adjacency Matrix:");
	  
	  for(int i=1; i<=n; i++)
	  {
		  for(int j=1; j<=n; j++)
		  {
			 a[i][j] = sc.nextInt(); 
		  }
	  }
	  
	  sc.close();
	}
	
	
	void MST()
	{
	  int visited[] = new int[10];  // visited array is used for checking whether the element is visited(1) or not(0)
	  int t[][] = new int [10][3];  // 2D array used for storing edges, weight and min variables
	  
	  int cost = 0, count = 0, u = 0, v = 0, k = 0;
	  /*  All variables are same as compared to Kruskal's Algorithm, except older cost is count* here and older sum is cost* here  */
	  
	  visited[1] = 1; 
	  /* 1st element of visited array is initialised to 1 and automatically all other elements are initialised to 0 */
	  
	  while(count != n-1)
	  {
		int min = 999;
		
		for(int i=1; i<=n; i++)     // loops to find value of min variable
		{
			for(int j=1; j<=n; j++)
			{
			   if(visited[i] == 1   &&   visited[j] == 0   &&   a[i][j] < min) // min condition
			   {
				   // visited[i] represents row,    which should be selected(1) in a[][]
				   // visited[j] represents column, which shouldn't be selected(0) in a[][]
				   
				   min = a[i][j];
				   u = i;
				   v = j;
			   }
			   
			}
		}
		
		if(min == 999) // infinity condition
			break;
		
		// Prim's Logic
		
		t[k][0] = u;   // edges  
		t[k][1] = v;   // weight
		t[k][2] = min; // min values
		
		//Updating values
		cost = cost + min;
		k++ ;
		count++ ;
		
		visited[v] = 1; // the visited element is made as 1 in the visited array
	  }
	  
	  if(count == n-1)
	  {
		System.out.println("Minimum Spanning Tree is:");
		System.out.println("");
		
		System.out.println("******************");
		System.out.println("Edges     Weights");
		System.out.println("******************");
		
		for(int i=0; i<k; i++)
		{
		  System.out.println(t[i][0]+ "->" +t[i][1]+ "      "+t[i][2]);
		}
		
		System.out.println("");
		System.out.println("Cost of the Minimum Spanning Tree = " +cost);
		
	  }
	  else
		  System.out.println("Mininmum Spannning Tree doesn't exist");
	  
	}
	
	
	public static void main(String[] args) 
	{
	   Pgrm9 P = new Pgrm9();
	   
	   P.Read_matrix();
	   
	   System.out.println("");
	   System.out.println("");
	   
	   P.MST();

	}

}

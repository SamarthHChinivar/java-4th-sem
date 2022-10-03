// Program 8
/* 8. Find Minimum Cost Spanning Tree of a given undirected graph using Kruskal's algorithm. Implement the program in Java language. */


import java.util.Scanner;

public class Pgrm8 
{
   // instance variables
	
   int n;
   int a[][] = new int [10][10];
   
   
   void Read_matrix()
   {
	  Scanner sc = new Scanner(System.in);
	  
	  
	  System.out.println("Kruskal's Algorithm using Greedy method :");
	  System.out.println("******************************************");
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
	 int p[] = new int[10];        // parent array
	 int t[][] = new int [10][3];  // 2D array to store Edges, Weight and min variables
	 
	
	 for(int i=1;i<=n;i++) // for loop to initialise parent array
	 {
		p[i] = i; //parent array initially has the same values of i 
	 }
	 
	 
	 int cost = 0, sum = 0, u = 0, v = 0, k = 0;
	 
	 while(cost != n-1)
	 {
	    int min = 999;
	    
		for(int i=1; i<=n; i++)	   // for loops for getting variable min 
	    {
	       for(int j=1; j<=n; j++)
	       {
	    	  if(a[i][j] != 0  &&  a[i][j] < min)
	    	  {
	    		 min = a[i][j];
	    		 u = i;
	    		 v = j;
	    	  }
	       }
	       
	    }
		
		
		if(min == 999) // infinity condition
			break;
		
		
		// Kruskal's Logic
		
		int i = u;
		while(i != p[i])
			i = p[i];
		
		int j = v;
		while(j != p[j])
			j = p[j];
		
		
		if(i != j)
		{
		  t[k][0] = u;
		  t[k][1] = v;
		  t[k][2] = min;
		  
		  k++ ;
		  
		  
		  sum = sum + min;
		  p[j] = i;
		  
		  cost++ ;
		}
		
		a[u][v] = a[v][u] = 999; // selected items are made as infinity
	 }
	 
	 
	 if(cost == n-1)
	 {
		System.out.println("Minimum Spanning Tree :");
		System.out.println("");
		
		System.out.println("******************");
		System.out.println("Edges     Weights");
		System.out.println("******************");
		
		for(int i =0; i<n-1; i++)
			System.out.println(t[i][0]+ "->" +t[i][1]+ "      " +t[i][2]);
		
		System.out.println("");
		System.out.println("Cost of Minimum Spanning Tree = " +sum);	
	 }
	 
	 else
		 System.out.println("Minimum Spanning Tree doesn't exist");
	 
   }
   
   
	public static void main(String[] args) 
	{
	   Pgrm8 K = new Pgrm8();
	   
	   K.Read_matrix();
	   
	   System.out.println("");
	   System.out.println("");
	   
	   K.MST();
	}

}

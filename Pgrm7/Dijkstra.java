import java.util.Scanner;

class Dijkstra
{
  int n, src;
  int a[][] = new int [10][10];
  
  void Read_matrix() // Method used for taking input of cost adjacency matrix and source vertex
  {
    System.out.println("Dijkstra Algorithm");
    System.out.println("*******************");
    System.out.println("");
    
    
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number of Vertices: ");
    n = sc.nextInt();
    
    System.out.println("Enter the Vertices of Cost Adjacency Matrix: ");
    for(int i=1; i<=n; i++)
    {
      for(int j=1; j<=n; j++)
    	  a[i][j] = sc.nextInt();
    }
    
    System.out.println("Enter the Source Vertex: ");
    src = sc.nextInt();
    
    sc.close();
  }
  
  void Shortest_path() // Method used to find shortest path, according to Dijkstra Logic
  {
	int i, j, v, min, u = 0;
	
	int d[] = new int [10]; // it is used to store distance covered
	int p[] = new int [10]; // it is used to store no. of vertices covered
	int s[] = new int [10]; // it is used for denoting whether the vertex is selected(1) or not(0)
	
	for(i=1; i<=n; i++) //used to initalize arrays d,p,s with 1st Element OR src 
	{
	  d[i] = a[src][i];
	  p[i] = src;
	  s[i] = 0;
	}
	
	
	s[src] = 1; // as 1st Element is already selected
	d[src] = 0; // as distance of src node from src node is 0 only
	
	
	for(i=1; i<=n; i++)
	{
	  for(j=1, min = 999; j<=n; j++)
	  {
		/* loop used to find minimum distance covered of 1st vertex from src vertex 
		   and to find it's position */
		  
		if(s[j] == 0  &&  d[j]<min)
		{
		  min = d[j];
		  u = j;
		}
		
	  }
	  
	  s[u] = 1;
	  
	  for(v=1; v<=n; v++)
	  {
		/* loop used to find the minimum distance of other vertices excepting 
		   1st vertex from src vertex, according to Dijkstra Logic  
		   and to find it's position */
		  
		  if(s[v] == 0  &&  d[u] + a[u][v] < d[v])
		  {
		    // Dijkstra Conditions and Logic
			  
			d[v] = d[u] + a[u][v];
		    
		    p[v] = u;
		  }
		  
	  } // end of v loop
	  
	} // end of i loop
	
	
	  System.out.println("Shortest Paths available from Soucrce Vertex are shown below: ");
	  System.out.println("Format of Output:");
	  System.out.println("Destination Vertex <- (Intermediate Vertices) <- Source Vertex = Minimum Distance covered");
	  System.out.println("");
	  
	  for(j=1; j<=n; j++) // loop to show output
	  {
		  if(d[j] == 0  ||  d[j] == 999)
		    	System.out.println(j+ "<-" +src+ " = " +d[j]);
	    
	    else
	    {
	      i = j;
	      
	      while(i != src)
	      {
	    	System.out.print(i+ "<-");
	    	
	    	i = p[i]; // value of i is updated with the help of p[i]
	      }
	      
	      System.out.println(src+ " = " +d[j]);
	    }
	    
	  }
	  
	} // end of Shortest_path()
	
  } // end of class
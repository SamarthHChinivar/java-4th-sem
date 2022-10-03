//Program 7
/* 7. From a given vertex in a weighted connected graph, find shortest paths to other 
  vertices using Dijkstra's algorithm. Write the program in Java. */

public class Main
{
	public static void main(String[] args) 
	{
	   Dijkstra D = new Dijkstra();
	  
	  D.Read_matrix();
	  D.Shortest_path();
	}

}

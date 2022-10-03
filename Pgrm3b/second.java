package Pgrm3b;

public class second implements Runnable // Another way of using threads
{
    int x;
    
	public second(int n)
	{
	   x = n;
	}
	
	public void run()
	{
	  System.out.println("Thread 2: Square of the random no: "+(x * x));
	  System.out.println("");
	}
}

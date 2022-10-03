package Pgrm3b;

public class third extends Thread 
{
  int x;
  
  public third(int n)
  {
    x = n;
  }
  
  public void run()
  {
	System.out.println("Thread 3: Cube of the random no: "+(x * x * x));
	System.out.println("");
	System.out.println("");
  }
  
}

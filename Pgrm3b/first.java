package Pgrm3b;

import java.util.Random;

public class first extends Thread
{
	/* Thread is an in built java class and threads can be accessed using inheritance */
	
   public void run() // In a derived class of Thread class , public void run() must be present
   {
	 Random r = new Random(); // declaring object r of Random class , similar to Scanner class
	 
	 int num;
	 
	 try 
	 {
		 /*During threading , some issues might arise , due to hardware , so we use try block for exception handling */
		 
		 for(int i=0; i<10; i++)
	 
	     {
		   num = r.nextInt(10); //taking a random no. as input using r object of Random class 
	 
	 
	       System.out.println("Thread 1: generated Random Nubmer: "+num);
	       System.out.println("");
	 
	       Thread t2 = new Thread(new second(num));
	       /* Creating Second Thread using the First Thread */ 
	       
	       t2.start(); //start() is used for starting/calling the specific thread
	       Thread.sleep(1000);
	       /* Thread.sleep(integer) declares that no operation takes place using thread, for (integer) amount of milliseconds */
	 
	       Thread t3 = new Thread(new third(num));
	       /* Creating Third Thread using the First Thread */ 
	       
	       t3.start(); //start() is used for starting/calling the specific thread
	       Thread.sleep(1000);
	       /* Thread.sleep(integer) declares that no operation takes place using thread, for (integer) amount of milliseconds */
	 
	     }
	 }
	 
	 catch(Exception e)
	 {
		System.out.println(e.getMessage());
		System.out.println("");
	 }
   }
}

//Demonstrating thread priority through this example

/*  OOC POGIL ASSESSMENT */
/*  GROUP - 9  */

/*  1VA19IS044 SAMARTH   HC  */
/*  1VA19IS012 SREEVATSA BL  */

class Thread_P implements Runnable
{   
    Thread T; // Thread Variable
    
    //instance variables
    
    long click = 0;
    
    private volatile boolean running = true;
    // volatile keyword is used here, as click is of long type
    // boolean is used here, as here true/false condition is used here
    // private specifier is used, as it should be used, only by the required methods
	
    public Thread_P(int p) // constructor uses public access specifier
    {
       //initialising the Thread
       T = new Thread(this);
       // Thread(Runnable Object)
       
       T.setPriority(p); // variable p(1 to 10) is used for setPriority(int) function itself 
    }
    
    public void run()
    {
      while(running)
    	  click++;
    }
    
    public void stop()
    {
      running = false;
    }
    
    public void start()
    {
      T.start();
    }
    
    public static void main(String[] args) 
	{
	   Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
	   /* Here JVM uses current thread (currentThread()) and it's priority is set to maximum (setPriority(Thread.MAX_PRIORITY)) */
	   
	   // Creating Threads for high and low priority threads
	   
	   Thread_P h = new Thread_P(Thread.NORM_PRIORITY + 2);
	   Thread_P l = new Thread_P(Thread.NORM_PRIORITY - 2);
	   
	   //starting these threads
	   h.start();
	   l.start();
	   
	   // using try - catch blocks for child threads
	   
	   try
	   {
		 Thread.sleep(10000);
	   }
	   
	   catch(Exception e)
	   {
		 System.out.println(e.getLocalizedMessage());
		 System.out.println("");
	   }
	   
	   // Wait for child threads to terminate
	   h.stop();
	   l.stop();
	   
	   
	   //using 2nd round of try - catch blocks
	   
	   try
	   {
		 h.T.join();
		 l.T.join();
		 
		 /* join() is a synchronised method, used for joining 2 threads */
	   }
	   
	   catch(InterruptedException e)
	   {
		 System.out.println("Interrupted Exeception is caught");
		 System.out.println("");
	   }
	   
	   System.out.println("Low  Priority Thread = " +l.click);
	   System.out.println("High Priority Thread = " +h.click);

	}
	
}
   
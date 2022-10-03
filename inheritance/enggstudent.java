package inheritance; // In Eclipse , package is used for encapsulation feature of OOP 

public class enggstudent extends student {

   String branch;
	
	enggstudent(String n, int a, int s, String b)
 {
	  super(n,a,s); 
	  /*keyword constructor which calls the constructor of base class, for initialising
	    properties of base class */
	  
	  branch = b; //initialised property of derived class
 }
	
	void enggdisplay()
	{
	  System.out.println("Branch:" +branch);
	  System.out.println("");
	}
		
}


package inheritance; // In Eclipse , package is used for encapsulation feature of OOP 

public class scistudent extends student {
     
String major;
	
	scistudent(String n, int a, int s, String m)
	{
	  super(n,a,s); //initalising properties of base class
	  
	  major = m; 
	}
	
	void scidisplay()
	{
	  System.out.println("Major: " +major);
	  System.out.println("");
	}
}

//Program 2 (b).
/*2 b. Write a Java class called Customer to store their name and date_of_birth. The
date_of_birth format should be dd/mm/yyyy. Write methods to read customer data as
and display as using StringTokenizer class considering the delimiter character as “/”. */

import java.util.Scanner;
import java.util.StringTokenizer;

class customer
{
  String name , dob;
  
  void read()
  {
    Scanner sc = new Scanner(System.in);
	  
    System.out.println("Enter Customer's Name: ");
    name = sc.next();
    
    System.out.println("Enter Customer's Date of Birth in dd/mm/yyyy format only: ");
    dob = sc.next();
    
  }
  
  void display()
  {
	StringTokenizer st = new StringTokenizer(dob,"/");
	// Format of this constructor : StringTokenizer( variable , delimiter (mostly string type) )
	
	System.out.print(name+" ,  ");
	
	while(st.hasMoreTokens()) 
	 /* hasMoreTokens() is used to check (boolean return type) , whether next token is present or empty */
	{
		String val = st.nextToken();
		/* nextToken() (String return type) is used for returning the next token */
		
		System.out.print(val);
		
		if(st.countTokens() != 0)
			System.out.print(",");
		
		/* countTokens() (integer return type) is used for counting no. of tokens present in the object */
	}
	
	System.out.println("");
  }
  
}



public class Pgrm2b {

	public static void main(String[] args) {
		
		System.out.println("Name: Vamshi");
		System.out.println("USN:  1VA19IS058");
		System.out.println(""); 
	customer c = new customer();
	
	System.out.println("Enter Customer Details :");
	c.read();
	
	System.out.println("Customer Details are :");
	c.display();
	}
}
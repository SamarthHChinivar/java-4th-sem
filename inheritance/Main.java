package inheritance; // In Eclipse , package is used for encapsulation feature of OOP 
// Here Concept of Overriding is used with the help of package

import java.util.Scanner;

public class Main{
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String n, b, m;
	int    a, s, choice;
	
	do
	{
	   System.out.println("   Student MENU:");
	   System.out.println("1. Engineering Student");
	   System.out.println("2. Science Student");
	   System.out.println("3. Exit");
	   
	   System.out.println("Enter suitable number for suitable operation");
	   choice = sc.nextInt();
	   
	   switch(choice)
	   {
	     case 1:
	    	 System.out.println("Enter Student details:");
	    	 
	    	 System.out.print("Name:     ");
	    	 n = sc.next();
	    	 System.out.print("Age:      ");
	    	 a = sc.nextInt();
	    	 System.out.print("Sem:      ");
	    	 s = sc.nextInt();
	    	 System.out.print("Branch: ");
	    	 b = sc.next();
	    	 System.out.println("");
	    	 
	    	 enggstudent E = new enggstudent(n, a, s, b); // allocating memory with the help of constructor
	    	 
	    	 E.display();
	    	 E.enggdisplay();
	    	 
	    	 break;
	    	 
	     case 2:
	    	 System.out.println("Enter Student details:");
	    	 
	    	 System.out.print("Name:     ");
	    	 n = sc.next();
	    	 System.out.print("Age:      ");
	    	 a = sc.nextInt();
	    	 System.out.print("Sem:      ");
	    	 s = sc.nextInt();
	    	 System.out.print("Major:    ");
	    	 m = sc.next();
	    	  System.out.println("");
	    	 
	    	 scistudent S = new scistudent(n, a, s, m);
	    	 
	    	 S.display();
	    	 S.scidisplay();
	    	 
	    	 break;
	    	 
	    	 
	     case 3:
	    	 break;
	    	 
	     default: 
	    	 System.out.println("Invalid choice");
	    	 
	   }
	   
	} while(choice != 3);
	
}

}

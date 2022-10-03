package Pgrm2a; // In Eclipse , package is used for encapsulation feature of OOP 
//Here Concept of Overriding is used with the help of package

import java.util.Scanner;

/* 2 a. Design a super
class called Staff with details as StaffId, Name, Phone, Salary. Extend this
class by writing three subclasses namely Teaching (domain, publications),
Technical (skills), and Contract (period). Write a Java program to read and
display at least 3 staff objects of all three categories */


public class Main 
{

	public static void main(String[] args) 
	{	
      Scanner sob = new Scanner(System.in);
		
	  int     s , sal, choice;
	  String  n, p, pub, d, per, skill;
	  
	  System.out.println("STAFF MENU:");
	  System.out.println("1. Teaching   2. Technical");
	  System.out.println("3. Contract");
	  
	  System.out.println("Enter suitable number for suitable operation:");
	  choice = sob.nextInt();
	  
	  int i;
	  
	  switch(choice)
	  {
	  case 1:
		  Teaching t[] = new Teaching[3]; //declaring array of objects of size 3
		  
		  for(i=0; i<3; i++)
		  {
		    System.out.println("Enter Details of Teaching Staff :");
		    
		    System.out.print("Staff ID    :");
		    s = sob.nextInt();
		    System.out.print("Salary      :");
		    sal = sob.nextInt();
		    System.out.print("Name        :");
		    n = sob.next();
		    System.out.print("Phone Number:");
		    p = sob.next();
		    System.out.print("Domian      :");
		    d = sob.next();
		    System.out.print("Publication :");
		    pub = sob.next();
		    System.out.println("");
		    
		    t[i] = new Teaching(s, sal, n, p, d, pub);
		    //allocating memory using constructor 
		    
		  }
		  
		  for(i=0; i<3; i++)
		  {
			System.out.println("Details of Teaching Staff "+(i+1)+":");
			
			t[i].display();
			t[i].TeachDisplay();
			
			 System.out.println("");
		  }
		  
		  break;
		
	  case 2:
		  Technical T[] = new Technical[3];
		  
		  for(i=0; i<3; i++)
		  {
		    System.out.println("Enter Details of Technical Staff :");
		    
		    System.out.print("Staff ID    :");
		    s = sob.nextInt();
		    System.out.print("Salary      :");
		    sal = sob.nextInt();
		    System.out.print("Name        :");
		    n = sob.next();
		    System.out.print("Phone Number:");
		    p = sob.next();
		    System.out.print("Skills      :");
		    skill = sob.next();
		    System.out.println("");
		    
		    T[i] = new Technical(s, sal, n, p, skill);
		    //allocating memory using constructor 
		    
		  }
		  
		  for(i=0;i<3;i++)
		  {
		    System.out.println("Details of Technical Staff "+(i+1)+":");
		    
		    T[i].display();
		    T[i].TechDisplay();
		    
		    System.out.println("");
		  }
		  
		  break;
		  
	  case 3:
		  Contract c[] = new Contract[3];
		  
		  for(i=0; i<3; i++)
		  {
		    System.out.println("Enter Details of Contract Staff :");
		    
		    System.out.print("Staff ID    :");
		    s = sob.nextInt();
		    System.out.print("Salary      :");
		    sal = sob.nextInt();
		    System.out.print("Name        :");
		    n = sob.next();
		    System.out.print("Phone Number:");
		    p = sob.next();
		    System.out.print("Period      :");
		    per = sob.next();
		    System.out.println("");
		    
		    c[i] = new Contract(s, sal, n, p, per);
		    //allocating memory using constructor 
		    
		  }
		  
		  for(i=0; i<3; i++)
		  {
		    System.out.println("Details of Contract Staff "+(i+1)+":");
		    
		    c[i].display();
		    c[i].ConDisplay();
		    
		    System.out.println("");
		  }
		  
		  break;
		  
	  default:
		  System.out.println("Invalid Choice");
     
	  }
	}
}
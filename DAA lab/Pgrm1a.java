// Program 1(a).
/*Create a Java class called Student with
the following details as variables within it. (i) USN (ii) Name (iii) Branch
(iv) Phone Write a Java program to create n Student objects and print the USN,
Name, Branch, and Phone of these objects with suitable headings. */

import java.util.Scanner;

class student
{
  String usn,name,branch,phone; // properties
  
  void read() //to get input of properties
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter usn: \t");
    usn = sc.next();
    System.out.print("Enter name: \t");
    name = sc.next();
    System.out.print("Enter branch: \t");
    branch = sc.next();
    System.out.print("Enter phone number: ");
    phone = sc.next();
    System.out.println("");
    
    sc.close();
  }
  
  void display() //to display the properties
  {
    System.out.println("USN:          "+usn);
    System.out.println("Name:         "+name);
    System.out.println("Branch:       "+branch);
    System.out.println("Phone number: "+phone);
    System.out.println("");
  }
}

public class Pgrm1a
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
  
    int i;
  
    System.out.println("Enter the no. of Students:");
    int n = sc.nextInt(); // input of n
    
    student s[] = new student[n]; // creating an array of n objects
   
    for(i=0;i<n;i++)
    	s[i] = new student(); //allocating memory of objects in required order using the constructor
    
    System.out.println("Enter details of the Student:");	
    for(i=0;i<n;i++)
    	s[i].read(); //calling read() for taking input of properties
    	
    System.out.println("Student details are:");	
    for(i=0;i<n;i++)
    	s[i].display(); //calling display() for showing output of properties
    
    sc.close();
  }
}
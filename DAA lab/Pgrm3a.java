// Pgrm 3(a).
/* 3 a. Write a Java program to read two integers a and b. Compute a/b and print, when b
is not zero. Raise an exception when b is equal to zero. */

import java.util.Scanner;

public class Pgrm3a {

	public void divide(int a, int b) throws Exception  // method of Pgrm3a
	{ 
		// throws Exception denotes to JDK that , this method might throw an Exception.
		
		float r = a/b;
		
		System.out.println("Result:");
		System.out.println(a+ "/" +b+ " = "+r);
	}
	
	public static void main(String[] args) {
		
		int a,b;
		
		System.out.println("Name: Samarth");
		System.out.println("USN:  1VA19IS044");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numerator: ");
		a = sc.nextInt();
		
		System.out.println("Enter Denominator: ");
		b = sc.nextInt();
		
		Pgrm3a p = new Pgrm3a();
		
		try // JDK itself tries the block preceeded with keyword try
		{
		  p.divide(a,b);
		}
		
		catch(Exception e) // JDK catches the exception , and executes the below block 
		{
		  /* Format of catch block is : catch(Exception e) */
			
		  System.out.println("Divide by Zero Exception");
		}
	}

}

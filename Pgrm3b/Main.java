package Pgrm3b;

//Program 3(b).
/* 3. b Write a Java program that implements a multi-thread application that hash tree
threads. First thread generates a random integer for every 1 second; second thread
computes the square of the number and prints; third thread will print the value of cube
of the number. */


public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Name: Samarth");
		System.out.println("USN:  1VA19IS044");
		System.out.println("");
		
		first f = new first();
		
		f.run();
		
	}

}
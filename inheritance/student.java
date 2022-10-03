package inheritance; // In Eclipse , package is used for encapsulation feature of OOP 

public class student {
	String name;
	   int    age,sem; //properties

	  student(String n, int a, int s) //parameterised constructor
	  {
		/*assigning initial values to properties using constructor */ 
		  
		name = n;                     
		age = a;
		sem = s;
	  }

	  void display() //methods
	  {
		System.out.println("Student details are:");
		System.out.println("Name:  " +name);
		System.out.println("Age:   " +age);
		System.out.println("Sem:   " +sem);
	   }
}

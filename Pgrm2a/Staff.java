package Pgrm2a; // In Eclipse , package is used for encapsulation feature of OOP 

public class Staff 
{
   int    staffid, salary;
   String name, phone;
   
   Staff(int s, int sal, String n, String p) 
   /* if names of parameters and properties are same , then we use this keyword for indicating name of properties  */ 
   {
	 staffid = s;
	 salary = sal;
	 name = n;
	 phone = p;
   }
   
   void display()
   {
     System.out.println("Staff ID    :"+staffid);
     System.out.println("Salary      :"+salary);
     System.out.println("Name        :"+name);
     System.out.println("Phone       :"+phone);
   }

}

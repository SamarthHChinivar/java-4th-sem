
public class hello {

	//Constructor Overloading:- 
	
	//instance variables
	String model;  //thread safe and stored in heap memory
	String colour;
	
	void display()
	{
	  System.out.println("Hello");
	}
	
	static int count = 0;
	{
	  count ++;
	}
	
	hello()
	{
		System.out.println("Hello const");
	}
	
	hello(int x )
	{
		System.out.println("Hello "+x);
	}
	
	
	public static void main(String[] args) {
		
		
		hello h = new hello(); // not thread safe and stored in stack memory
		
		h.display();
		
		hello h1 = new hello(5);
		
		System.out.println("NO = "+count);

	}

}

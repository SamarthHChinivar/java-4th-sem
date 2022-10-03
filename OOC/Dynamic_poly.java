// Dynamic Binding 
class A
{
	void show()
	{
		System.out.println("A");
	}
}

class B extends A
{
	void show1()
	{
		System.out.println("B");
	}
}

public class Dynamic_poly {

	public static void main(String[] args) {
		B a = new B(); //as constructor is of class B , so output will be B
		a.show1();
		
		B a1 = new B(); //as constructor is of class A , so output will be A
		a1.show1();
	}

}

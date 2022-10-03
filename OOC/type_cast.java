
public class type_cast {

	public static void main(String[] args) {
		int    a = 10;
		double d;
		
		d = a;      //implicit type casting
		a = (int)d; // explicit type casting
		
		System.out.println("Value of A: "+a);
		System.out.println("Value of D: "+d);
		
		//convert int to string
		
		String s = String.valueOf(a);
		
		System.out.println("String Value of A: "+a);
		
		//convert string to int

	}

}

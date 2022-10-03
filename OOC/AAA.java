import java.util.Scanner;
import java.util.Random;

public class AAA {

	static int n1 = 3;
	private int n2 ;
	private int n3; // initialising using constructor
	
	AAA(int no1, int no2)
	{
	  n2 = no1;
	  n3 = no2;
	}
	
	private void display()
	{
		System.out.println(n2+" in display func");
		System.out.println(n3+" in display func");
	}
	
	static public  void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		n1 = r.nextInt(25);
		
		System.out.println("Enter any 2 numbers above "+n1+" :");
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(n1);
		
		AAA a = new AAA(x,y); 
		a.display();
		
		sc.close();
	}

}

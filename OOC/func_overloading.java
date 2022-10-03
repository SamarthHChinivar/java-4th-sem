import java.util.Scanner;

class Function
{
	void area(float r)
	{
		float ar = 3.1428f * r * r;
		System.out.println("Area = "+ar);
	}
	
	void area(int a, int b)
	{
	   int ar = a * b;
	   System.out.println("Area = "+ar);
	}
	
	void area(float b, float h)
	{
		float ar = 0.5f * b * h;
		System.out.println("Area = "+ar);
	}
}

public class func_overloading {
	
	public static void main(String[] args) {
		
		int   choice, l, b;
		float r, bs, h;
		
		Function f = new Function();
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("AREA MENU:");
			System.out.println("1.Area of Circle:");
			System.out.println("2.Area of Rectangle:");
			System.out.println("3.Area of Triangle:");
			System.out.println("4.Exit");
			
			System.out.println("Enter suitable no. for suitable operation:");
		    choice = sc.nextInt();
		    
			switch(choice)
		
			{
		
			case 1:
			System.out.println("Enter Radius:");
			r = sc.nextFloat();
		    
			f.area(r);
		    break;
		    
		
			case 2:
			System.out.println("Enter length and breadth:");
			l = sc.nextInt();
		    b = sc.nextInt();
		    
		    f.area(l,b);
		    break;
		    
		
			case 3:
			System.out.println("Enter base and height:");
		    bs = sc.nextFloat();
		    h = sc.nextFloat();
		    
		    f.area(bs,h);
		    break;
		    
			case 4: break;
			
			default:
				System.out.println("Invalid Choice");
				break;
		    
		   }
	   } while(choice != 4);

  }
}	

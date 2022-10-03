
public class exception_array {

	public static void main(String[] args) {
		
		try
		{
		  int a[] = new int[5];
		  
		  System.out.println("Sixth Element: "+a[6]);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("");
		}

	}

}

package Pgrm2a; // In Eclipse , package is used for encapsulation feature of OOP 

public class Teaching extends Staff
{
   String domain, publication;
   
   Teaching(int s, int sal, String n, String p, String d, String pub)
   {
     super(s, sal, n, p);
     
     domain = d;
     publication = p;
   }
   
   void TeachDisplay()
   {
	 System.out.println("Domain      :"+domain);
	 System.out.println("Publication :"+publication);
	 System.out.println("");
   }
}

package Pgrm2a; // In Eclipse , package is used for encapsulation feature of OOP 

public class Technical extends Staff
{
  String skills;
  
  Technical(int s, int sal, String n, String p, String skill)
  {
	super(s, sal, n, p);
	
	skills = skill;
  }
  
  void TechDisplay()
  {
    System.out.println("Skills      :"+skills);
    System.out.println("");
  }
}

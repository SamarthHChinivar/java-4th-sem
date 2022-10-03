package Pgrm2a;

public class Contract extends Staff
{ 
  String period;
  
  Contract(int s, int sal, String n, String p, String per)
  {
    super(s, sal, n, p);
    
    period = per;
  }
  
  void ConDisplay()
  {
    System.out.println("Period      :"+period);
    System.out.println("");
  }
}

//Pgrm 6b
/* Implement in Java, the 0/1 Knapsack problem using Greedy method. */

import java.util.Scanner;

public class Pgrm6b 
{
   //properties of objects
   double weight[];
   double profit[];
   double ratio[];
   int    nItems;
   
   //property of Knapsack
   double capacity;
   
   
   Pgrm6b() //using the constructor for initialisation
   {
	   System.out.println("Knapsack Problem using Greedy Method:");
	   System.out.println("*************************************");
	   System.out.println("");
	   
	   System.out.println("Enter the number of objects:");
	   
	   Scanner sc = new Scanner(System.in);
	   nItems = sc.nextInt();
	   
	   //Creating Arrays Dynamically, using global variables
	   weight = new double[nItems];
	   profit = new double[nItems];
	   ratio = new double[nItems];
	   
	   System.out.println("Enter the Weights and Profits of the Objects:");
	   for(int i=0; i<nItems; i++)
       {
		 weight[i] = sc.nextDouble();
		 profit[i] = sc.nextDouble();
		 ratio[i] = (profit[i] / weight[i]);
       }
	   
	   System.out.println("Enter the Capacity of the Knapsack:");
	   capacity = sc.nextDouble();
	   
	   sc.close();
   }
 
   
   int nextMax()
   {
	 double max = 0;
	 int    index = -1;
	   
	 for(int i=0; i<nItems; i++)
	 {
	   if(ratio[i] > max)
	   {
		 max = ratio[i];
		 index = i;
	   }   
	 }
	 
	 return index;
   }
   
   
   void filling() //Method to fill the Knapsack using Greedy Method
   {
	 double cw = 0; //current weight
	 double cp = 0; //current profit
	 double select[] = new double[nItems]; //it denotes the fraction occupied or mathematically, it is x of i OR x(i)
	 
	 while(cw < capacity)
	 {
	   int item = nextMax();
	   
	   if(item == -1)
		   break;
	   
	   if(cw + weight[item] <= capacity)
	   {
		 cp += profit[item];
		 cw += weight[item];
		 
		 ratio[item] = 0; //ratio is made 0, so that next comparision in nextMax() goes on
		 select[item] = 1; // select is 1, as full fraction of object is selected
	   }
	   
	   else
	   {
		 select[item] = (capacity - cw) / weight[item]; //this formula is used for calculating partial fraction
		 
		 cp = cp + (select[item] * profit[item]);
		 cw = cw + (select[item] * weight[item]);
		 
		 break; //to break out of the loop, as the Knapsack is Full
	   }
	 }
	 
	 System.out.println("");
	 System.out.println("Item selected     Fraction(0/1/partial)");
	 System.out.println("***************************************");
	 System.out.println("");
	 
	 for(int i=0; i<nItems; i++)
		 System.out.println((i+1)+ "                 " +select[i]);
	 
	 System.out.println("");
	 
	 System.out.println("Max Profit = "+cp);
	 System.out.println("Max Weight = "+cw);
   }
   
   
   public static void main(String[] args)
   {
	 Pgrm6b P = new Pgrm6b();
	 P.filling();
   }

}

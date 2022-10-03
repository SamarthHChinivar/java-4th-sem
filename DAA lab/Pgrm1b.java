//Pgrm 1(b).
/*Write a Java program to implement the Stack using arrays. Write Push(), Pop(), 
  and Display() methods to demonstrate its working.*/

import java.util.Scanner;

class stack
{ 
  final int size = 5;      //properties
  int s[] = new int[size];
  int top = -1;
  /*top points to position of stack, 
   where the last element is present*/
  
  void push(int item)      //methods
  {
    if(top == size-1)
    	System.out.println("Stack Overflow");
    else
    	s[++top] = item;
  }
  
  void pop()
  {
    int item;
    
	if(top == -1)
		System.out.println("Stack Underflow");
    else
     {
        item = s[top--];
        System.out.println("Item Deleted = "+item);
     }
  }
  
  void display()
  {
	int i;
	
	if(top == -1)
		System.out.println("Stack is Empty");
	else
	{
		System.out.println("Contents of Stack are:");
		for(i = 0; i <= top; i++)
			System.out.print(s[i]+"\t");
		
		System.out.println("");
	}
  }
	 
}


public class Pgrm1b {

	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in); 
	 
	  stack S = new stack();
	  int   item,choice;
	  
	  do
	  {
		 System.out.println("      MENU:     ");
		 System.out.println("1.push     2.pop");
		 System.out.println("3.display  4.exit");
		 
		 System.out.println("Enter Suitable Number for Suitable Operation:");
		 choice = sc.nextInt();
		 
		 switch(choice)
		 {
		   case 1:
			       System.out.println("Enter the item to be inserted:");
			       item = sc.nextInt();
			      
			       S.push(item);
			       break;
			       
		   case 2:
			       S.pop();
			       break;
			       
		   case 3:
			       S.display();
			       break;
			       
		   case 4: break;
		   
		   default:
			       System.out.println("Invalid Choice");
		           break;
		 }
		 
	  } while(choice != 4);
	  
	  sc.close();
	  
	}

}

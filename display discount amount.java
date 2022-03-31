//A pen costs 50$ and it is been sold at a discount of 12%, Write a program to display discount
amount and selling price of the pen?

import java.util.Scanner;
 
public class Main
{
	public static void main(String args[])
	{
 
	double  dis,amount,markedprice,s;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter markedprice ");	
               
	markedprice=sc.nextDouble();
 
        System.out.println("enter discount percentage ");	
               
	dis=sc.nextDouble();			
	
        s=100-dis;
 
	amount= (s*markedprice)/100;
 
	System.out.println("amount after discount="+amount);
 
	}
}

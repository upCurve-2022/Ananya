//Write a java program to calculate the largest number from the given three numbers using ternary operator.

import java.util.Scanner;  
public class Main
{  
public static void main(String[] args)   
{  
int m, n, o, largest;  
//object of the Scanner class  
Scanner sc = new Scanner(System.in);  
//reading input from the user  
System.out.println("Enter the first number:");  
m = sc.nextInt();  
System.out.println("Enter the second number:");  
n = sc.nextInt();  
System.out.println("Enter the third number:");  
o = sc.nextInt();  
largest = o > (m > n ? m : n) ? o : ((m > n) ? m : n);  
System.out.println("The largest number is: "+largest);  
}  
}

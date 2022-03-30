*/Write the program to print below mentioned series. (Fibonacci)
     1, 1, 2, 3, 5, 8, 13 ........... N
*/
import java.util.Scanner;
public class Main{

	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
	
		System.out.printf("Enter value ");
	int count= sc1.nextInt(); 
 int a=0,b=1,n3,i;    
 System.out.print(a+" "+n2); 
    
 for(i=2;i<count;++i)    
 {    
  n3=a+b;    
  System.out.print(" "+n3);    
  a=b;    
  b=n3;    
 }    
	}

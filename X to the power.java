*/Write the program to find the X to the power of n. 
Input: X = 2, n = 5
Output: 32
*/
import java.util.Scanner;
public class Main{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("Enter value ");
	    int X= sc.nextInt(); 
        System.out.println("power");
        int P=sc.nextInt();
    int temp=1;
        for(int i=0;i<P;i++){
            temp=temp*X;
        }
        System.out.println(temp);
	}
}

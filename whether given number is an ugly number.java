//Write a java program to check whether given number is an ugly number.
//Note: In number system, ugly numbers are positive numbers whose only prime factors are
//2,3,5.
import java.util.Scanner;
public class JavaHungry {
    public static void main(String args[]) 
    {
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        // Store the input number
        Integer inputNumber = sc.nextInt();
        
        checkUglyNumber(inputNumber);
    }
    
    public static void checkUglyNumber(Integer inputNumber)
    {
        int num = inputNumber;
        /* Loop will run until
        num becomes 1 */
        while(num != 1)
        {
            if (num % 2 == 0)
                num /= 2;
            else if (num % 3 == 0)
                num /= 3;
            else if (num % 5 == 0)
                num /= 5;    
            else
            {
                System.out.println(inputNumber + " is NOT an Ugly Number");
                /* Come out of the loop,
                method has void return type */
                return;
            }    
        }
        System.out.println(inputNumber + " is an Ugly Number");
    }
}

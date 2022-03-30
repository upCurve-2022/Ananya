*/Write a program to display the number in following sequence.
1, 4, 27, 256, 3125 .............. N
*/
import java.util.*;
import java.lang.Math;


public class Main
{
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        int m;
        System.out.println("Enter number: ");
        m=c.nextInt();
         for(int i=1;i<=m;i++)
        {
                System.out.print((int)Math.pow(i,i)+" ");

        }
    }
}

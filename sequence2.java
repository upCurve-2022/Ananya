*/Write a program to display the number in following sequence.
-1, 2, -3, 4, -5........N
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        int m;
        System.out.println("Enter number: ");
        m=c.nextInt();
        for(int i=1;i<=m;i++)
        {
            if(i%2!=0)
             System.out.print(" -"+i+" ");
            else
            System.out.print(i+" ");
        }
    }
}

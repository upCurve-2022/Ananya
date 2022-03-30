/*pyramid pattern 
     *
    * *
   * * *
  * * * *
 * * * * *
*/



import java.io.*;
public class Pyramid
{
    public static void printTriagle(int n)
    {
        // n=number of rows
        for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     
    // Driver Function
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          printTriagle(n);
    }
}

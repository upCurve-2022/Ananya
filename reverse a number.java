/*Write a program to reverse the number.
Input: 1234567890
Output: 0987654321
   */

import java.util.Scanner;
class ReversingaNumber {
   
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m,reverse=0;
        System.out.print("Enter n: ");
        int n = in.nextInt();
            while(n>0) {
                m=n%10;
                reverse=reverse*10+m;
                n=n/10;
               
            }
            System.out.println("Reverse of a number  is: " + reverse);
            
    }
}

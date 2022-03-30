*/Write a program to display the number in following sequence.
4, 16, 36, 64.......N
*/
import java.util.*;
import java.io.*;
class Sequence{    
public static void main(String[] args) {
Scanner sc1=new Scanner(System.in);
int m;
System.out.printf("Enter number");
m=sc1.nextInt();
int i=2;
while(m>0){
System.out.print((i * i) + " ");
m--;
i=i+2;
  }  
 }
}

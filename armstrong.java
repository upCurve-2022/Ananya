import java.util.*;
public class Armstrong{
public static void main(String args[]){
    int n,temp,r,res=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number:");//armstr
    n=sc.nextInt();
    temp=n;
    while(n!=0){
       r=n%10;
       res=res+r*r*r;
        n=n/10;
    }
        if(res==temp)
         System.out.println(temp+" is a armstrong number");
         else
         System.out.println(temp+" is not a armstrong number");
   
}
}

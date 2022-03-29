#java program to compare two strings
import java.util.*;
 class EqualCheck {
    public static void main(String args[]){
       String a,b;
        System.out.println("Enter string1");
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        System.out.println("Enter string2");
        Scanner s=new Scanner(System.in);
        b=s.nextLine();
        if(a.equals(b)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }

        if(a.equalsIgnoreCase(b)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
        System.out.println(a==b);
    }
}

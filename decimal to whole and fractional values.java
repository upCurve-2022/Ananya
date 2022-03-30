import java.util.*;
  public class WholeFractional {
  public static void main(String[] args) {
  Scanner sc1=new Scanner(System.in);
  System.out.print("Enter value:");
  double value = sc1.nextDouble();
  String s=String.valueOf(value);
  int i=s.indexOf(".");
  System.out.print("\nIntegral part: "+s.substring(0,i));
  System.out.print("\nafter part: "+s.substring(i+1));
  System.out.println();  
  }
}

//Write a java program to convert the string totally to uppercase.
public class Main {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
      String str = sc.nextLine().split(" ");
      String strUpper = str.toUpperCase();
      System.out.println("Original String: " + str);
      System.out.println("String changed to upper case: " + strUpper);
   }
}

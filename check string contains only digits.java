import java.util.*;
class Digit{
    public static void main(String[] args) {
        String str;
        int count=0;
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        for(int i=0;i<str.length();i++)
    {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                  count++;
            }
    }
    if(count==str.length())
        System.out.println("String contains only digits.");
    else
       System.out.println("String does not contains only digits.");
}
}



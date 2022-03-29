import java.util.*;
class Empty{
    public static void main(String[] args) {
        String str;
       
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        if(str.isEmpty()){
            System.out.println("string is empty");
            
        }
        else{
            System.out.println("string is not empty");
        }
    }
}

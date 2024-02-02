import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
         int num;
         char ch;
         System.out.println("Enter the character to find its ASCII value:");
         ch=in.next().charAt(0);
         num=ch;
         System.out.println("ASCII value of "+ch+" is "+num);
    }
}

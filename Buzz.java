import java.util.Scanner;

public class Buzz {
    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
        int num,rem,div;
        System.out.println("Enter the number to check whether it is spy or not:");
        num=in.nextInt();
        rem=num%10;
        div=num%7;
        if(rem == 7 || div == 0)
        System.out.println("Buzz Number");
        else
        System.out.println("Not a Buzz Number");
    }
}

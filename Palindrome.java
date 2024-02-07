import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
         int num,rem,temp,sum=0;
         System.out.println("Enter the number to check whether it is palindrome or not:");
         num=in.nextInt();
         temp=num;
         while(num!=0){
            rem=num%10;
            sum = sum*10+rem;;
            num/=10;
         }
         if(sum == temp)
         System.out.println("Palindrome Number");
         else
         System.out.println("Not a Palindrome Number");
    }
}

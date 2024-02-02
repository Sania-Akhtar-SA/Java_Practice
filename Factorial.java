import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
         int num,i,fact=1;
         System.out.println("Enter the number to calculate its factorial:");
         num=in.nextInt();
         System.out.println("Factorial of the number "+num+" is ");
         for(i=2;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of the "+num+" is "+fact);
    }
}

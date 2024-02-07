import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,sq,rem,sum=0;
        System.out.println("Enter the number to check whether it is neon or not:");
        num=in.nextInt();
        sq=num*num;
        while(sq > 0){
            rem=sq%10;
            sum = sum+rem;
            sq/=10;
        }
        if(sum == num)
        System.out.println("Neon Number");
        else
        System.out.println("Not an Neon Number");
    }
}

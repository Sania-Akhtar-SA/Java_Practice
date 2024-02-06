import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,rem,sum=0,pro=1;
        System.out.println("Enter the number to check whether it is spy or not:");
        num=in.nextInt();
        while(num > 0){
            rem=num%10;
            sum = sum+rem;
            pro = pro*rem;
            num/=10;
        }
        if(sum == pro)
        System.out.println("Spy Number");
        else
        System.out.println("Not a Spy Number");
    }
}

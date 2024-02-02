import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,rem,temp,sum=0;
        System.out.println("Enter the number to check it is armstrong or not:");
        num=in.nextInt();
        temp=num;
        while(num!=0){
            rem=num%10;
            sum = sum+rem*rem*rem;
            num=num/10;
        }
        if(sum == temp)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not an Armstrong Number");
    }
}

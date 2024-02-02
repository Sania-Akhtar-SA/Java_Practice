import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,rem,temp,sum=0;
        System.out.println("Enter the number to find its reverse:");
        num=in.nextInt();
        temp=num;
        while(num!=0){
            rem=num%10;
            sum = sum*10+rem;;
            num/=10;
        }
        System.out.println("Reverse of the number "+temp+" is "+sum);
    }
}

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,sq,d=1,rem,sum=0;
        System.out.println("Enter the number to check whether it is automorphic or not:");
        num=in.nextInt();
        sq=num*num;
        while(sq !=0){
            rem=sq%10;
            sum = sum+rem*d;
            sq/=10;
            d=d*10;
            if(sum == num)
            break;
        }
        if(sum == num)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
    }
}

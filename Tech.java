import java.util.Scanner;

public class Tech {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,l,sum,sq;
        String str,s1,s2;
        System.out.println("Enter the number to check whether it is tech or not:");
        num=in.nextInt();
        str=String.valueOf(num);
        l=str.length();
        if(l%2 == 0){
            s1=str.substring(0,l/2 );
            s2=str.substring(l/2,l );
            System.out.println(s1);
            System.out.println(s2);
            sum=Integer.parseInt(s1) + Integer.parseInt(s2);
            sq=sum*sum;
            if(sq == num)
            System.out.println("Tech Number");
            else
            System.out.println("Not a Tech number");
        }
        else{
            System.out.println("Enter an even digit of number.");
        }
    }
}

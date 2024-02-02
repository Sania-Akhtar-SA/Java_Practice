import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,i,count=0;
        System.out.println("Enter number to check whether it is a prime number or not:");
        num=in.nextInt();
        for(i=2;i<num;i++){
            if(num%i == 0)
            count++;
        }
        if(count > 0)
        System.out.println(num+" is not a Prime Number.");
        else
        System.out.println(num+" is a Prime Number.");
    }
}

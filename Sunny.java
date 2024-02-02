import java.util.Scanner;

public class Sunny {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,sqr;
        double sq;
        System.out.println("Enter the number to check whether it is sunny or not:");
        num=in.nextInt() + 1;
        sq=Math.sqrt(num);
        sqr=(int)sq;
        if(num == sqr*sqr)
        System.out.println("Sunny Number");
        else
        System.out.println("Not a Sunny Number");
    }
}

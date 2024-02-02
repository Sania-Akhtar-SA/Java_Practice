import java.util.Scanner;

public class fibonacci
{
    public static void main(String[] args){
    System.out.println("Hello World");
    Scanner in =new Scanner(System.in);
    int a=0,b=1,n,count=2;
    System.out.println("Enter range of the fibonacci series:");
    n=in.nextInt();
    while(count<=n){
        int temp=b;
        b=a+b;
        a=temp;
        count++;
    }
    System.out.println("Vaule of the fibonacci series ="+b);
    }
}
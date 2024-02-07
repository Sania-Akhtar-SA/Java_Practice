import java.util.Scanner;

public class Keith {
     public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    int a,b,n,rem,num,sum=0;
    System.out.println("Enter the number to check whether it is Keith or not:");
    n=in.nextInt();
    num=n;
    while(n!=0){
        rem=n%10;
        sum = sum+rem;
        n=n/10;
    }
    a=(num/10)%10;
    b=num%10;
    System.out.println(sum);
    System.out.println(a);
    System.out.println(b);
    while(sum < num ){
        int temp=sum;
        if(num/100 == 0){
            sum=sum+b;
            b=temp;
        }
        else{
            sum=sum+a+b;
            a=b;
            b=temp;
        }
        System.out.println(sum);
    }
    System.out.println(sum);
    if(sum == num)
    System.out.println("Keith Number");
    else
    System.out.println("Not a Keith Number");
    }
}

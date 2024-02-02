import java.util.Scanner;

public class Peterson {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
         int num,i,rem,temp,fact,sum=0;
         System.out.println("Enter the number to check whether it is Peterson or not:");
         num=in.nextInt();
         temp=num;
         while(num != 0 ){
            rem=num%10;
            fact=1;
            for(i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
         }
         if(sum == temp)
         System.out.println("Peterson Number");
         else
         System.out.println("Not a Peterson Number");
    }
}

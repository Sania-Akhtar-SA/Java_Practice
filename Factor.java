import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
         int num,i;
         System.out.println("Enter the number to find its factor:");
         num=in.nextInt();
         System.out.println("Facto of the number "+num+" is ");
         for(i=2;i<num;i++){
            if(num%i == 0)
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num,fact;
        System.out.println("Enter the number to calculate its factorial:");
        num=in.nextInt();
        // Recursion obj=new Recursion();
        // fact=obj.sum(num);
        fact=sum(num);
        System.out.println(fact);
    }
    static int sum(int i){
        if(i>0){
            return i * sum(i-1);
        }
        else{
            return 1;
        }
    }
}

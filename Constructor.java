import java.util.Scanner;

public class Constructor {
    int x,y;

    public Constructor(int yy){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        x=in.nextInt();
        y=yy;
    }
    public static void main (String[] args){
        Constructor obj=new Constructor(45);
        System.out.println("value of x is "+obj.x);
        System.out.println("value of y is "+obj.y);
    }
}

import java.util.Scanner;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name of the brand : ");
        String model = in.nextLine();
        System.out.println(brand + " " + model);
        greet();
    }
}

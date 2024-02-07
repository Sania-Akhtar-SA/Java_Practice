import java.util.Scanner;

public class Fascinating {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,l,num2,num3,i,a=1,count=0,chr;
        String str;
        char ch;
        System.out.println("Enter the number to check whether it is fascinating or not:");
        num=in.nextInt();
        num2 = num*2;
        num3 = num*3;
        str = String.valueOf(num) + String.valueOf(num2) + String.valueOf(num3);
        System.out.println(str);
        l=str.length();
        while (!(a > 9)) {
            for(i=0;i<l;i++){
                ch=str.charAt(i);
                chr=Character.getNumericValue(ch);
                if(chr == a){
                    ++ count ;
                    break;
                }
            }a++;
        }
        if(count == 9){
            System.out.println("Fascinating Number");
        } 
        else 
        System.out.println("Not a Fascinating Number");
        
    }
}

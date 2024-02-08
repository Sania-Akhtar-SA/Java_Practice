public class Outer {
    int x=10;

    public class Inner {
        int y=8;
    }
}
 class Main {

    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner= outer.new Inner();
        System.out.println("Vaule from outer class :"+ outer.x);
        System.out.println("Vaule from inner class :"+ inner.y);
    }
    
}
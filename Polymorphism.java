class Fruits{
    public void Taste(){
        System.out.println("Fruits are Tasty.");
    }
}
class Mango extends Fruits{
    public void Taste(){
        System.out.println("Mango are sweet in taste. ");
    }
}
class Strawberry extends Fruits{
    public void Taste(){
        System.out.println("Strawberry are sweet and sour in taste. ");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Fruits f = new Fruits();
        Fruits m = new Mango();
        Strawberry s = new Strawberry();
        f.Taste();
        m.Taste();
        s.Taste();
    }
}

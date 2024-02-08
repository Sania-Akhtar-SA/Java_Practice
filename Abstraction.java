abstract class Abstraction {

    public abstract void BirdSound();
    // abstract method

    public void Fly(){
        System.out.println("Birds are flying");
    }
}

class Cuckoo extends Abstraction{

    public void BirdSound(){
        System.out.println("Koo Koo");
    }
}

class Bird{

    public static void main(String[] args) {
        Cuckoo obj = new Cuckoo();
        obj.BirdSound();;
        obj.Fly();
    }
}

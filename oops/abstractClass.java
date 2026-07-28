public class abstractClass {
    public static void main(String[] args) {
        Hourse h = new Hourse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
    
}
abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Hourse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
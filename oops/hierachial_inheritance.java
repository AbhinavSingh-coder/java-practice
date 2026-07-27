public class hierachial_inheritance {
    public static void main(String[] args) {
        Bird peacock = new Bird();
            peacock.eats();
            peacock.breathe();
        
        
    }
    
}
class Animal{
    String color;
    void eats(){
        System.out.println("eates");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
  
class Fish extends Animal{
    void swim(){
        System.out.println("swims in water");
    }

}

class mammel extends Animal{
    void walk(){
        System.out.println(" walks ");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

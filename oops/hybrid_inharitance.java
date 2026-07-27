public class hybrid_inharitance {
    public static void main(String[] args) {
        Eagle baaj = new Eagle();
        baaj.eat();
        baaj.color = "brown";
        System.out.println(baaj.color);
        
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eates");
    }

void breath(){
    System.out.println("breathes");
}
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Shark extends Fish{
    int fins;
    void size(){
        System.out.println("largest");
    }
}

class Mammels extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Dog extends Mammels{
 void legs(){
    System.out.println("4");
 }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Eagle extends Bird{
   void strongest(){
    System.out.println("strongest");
   }
}

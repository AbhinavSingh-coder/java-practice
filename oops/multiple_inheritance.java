public class multiple_inheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
            b.eatplants();
            b.eatmeats();
        
        
    }
    
}
interface Herbivore{
    void eatplants();

}

interface Carnivore{
   void eatmeats();
}

class Bear implements Herbivore, Carnivore{
    public void eatplants(){
        System.out.println("bear can eats plants");
    }

    public void eatmeats(){
        System.out.println("bear can eats meat");
    }
}

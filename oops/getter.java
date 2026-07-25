
public class getter {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setcolor("blue");
        System.out.println(p.getcolor());
        p.settip(5);
        System.out.println(p.gettip());
        p.setcolor("red");
        System.out.println(p.getcolor());
        
    }
    
}
class Pen {
  private String color;
   private int tip;

   String getcolor(){
    return this.color;
   }

 void setcolor(String newcolor){
    this.color = newcolor;
   }

   int gettip(){
    return this.tip;
   }
    void settip(int newtip){
    this.tip = newtip;
   }
}

public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
            q.moves();
        
        
    }
    
}
interface Cheesplayer{
    void moves();
}

class Queen implements Cheesplayer{
 public void moves(){
    System.out.println(" up, down, right, left,diagonal(in all 4 dir)");
 }
}
class Rook implements Cheesplayer{
 public void moves(){
    System.out.println(" up, down, right, left");
 }
}
class king implements Cheesplayer{
 public void moves(){
    System.out.println(" up, down, right, left,diagonal(by 1 step)");
 }
}
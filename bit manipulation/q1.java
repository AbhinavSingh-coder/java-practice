
import java.util.*;
public class q1 {
    public static void oddoreven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even no.");
        }else{
            System.out.println("odd no.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no. ");
        int n= sc.nextInt();
        oddoreven(n);
        
    }
    
}

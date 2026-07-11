
import java.util.*;
public class q40 {
    public static int getbit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n ");
        int n = sc.nextInt();
        System.out.print("enter i ");
        int i= sc.nextInt();
        System.out.println(getbit(n, i));
        
    }
    
}

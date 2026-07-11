import java.util.*;
public class q41 {
    public static int setbit(int n,int i){
        int bitmask = 1<<i;
        return n |bitmask;
    }


    public static int clearbit(int n ,int i){
        int bitmask = ~(1<<i);
        return n &bitmask;
    }

public static int update(int n, int i, int newbit){
    if(newbit == 0){
        return clearbit(n, i);
    }else{
        return setbit(n, i);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n ");
        int n= sc.nextInt();
        System.out.print("enter i ");
        int i = sc.nextInt();
        System.out.print("enetr newbit ");
        int newbit = sc.nextInt();
         System.out.println(update(n, i, newbit));
    }
    
}

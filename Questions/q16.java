import java.util.*;
public class q16 {
    public static void sum(int num[]){
        int sum =0;
        for(int i =0;i<=num.length;i++){
            sum += num[i];
            i++;
        }
    }
    public static void main(String[] args) {
        int num[] = {2,3,4,6};
        sum(num);
       
        
    }
    
}

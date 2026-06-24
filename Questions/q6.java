import java.util.*;
public class q6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no. ");
        int x = sc.nextInt();
        while(x>0){
        int last = x%10;
        System.out.print(last);
       
        x= x/10;
    }System.out.println();
    
    }
    
}

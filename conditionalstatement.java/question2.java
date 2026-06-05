// print if a number is odd or even


import java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        
    }
    
}

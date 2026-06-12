//decimal to binary

import java.util.*;
public class question10 {
    public static void dectobin(int n){
        int pow = 0;
        int binnum = 0;
        while(n>0){
            int rem = n % 2;
            binnum = binnum+(rem *(int) Math.pow(10,pow));
            pow++;
            n = n/2;
        }System.out.println(binnum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your dec. no.");
        int n = sc.nextInt();
       dectobin(n);
    }
    
}

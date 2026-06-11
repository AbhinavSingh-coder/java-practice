//check prime no. by second approach.

import java.util.*;
public class question7 {
    public static boolean isprime(int n){
        if(n == 2){
            return true;
        }
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter your no.");
        int n = sc.nextInt();
        System.out.println(isprime(n));
    }
}

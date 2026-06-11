//check prime no.
import java.util.*;
class question6{
    public static boolean isprime(int n){
        if(n == 2){
            return true;
        }
       for(int i =2; i<=n-1; i++){
        if(n % i == 0){
          return false;
        }
       }
       return true;
    } public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your no. ");
        int n = sc.nextInt();
        System.out.println(isprime(n));
    }
    
}
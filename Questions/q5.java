import java.util.*;
public class q5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no. ");
        int n = sc.nextInt();
        if(n == 2){
            System.out.println("2 is prime no.");
        }else if(n ==1){
            System.out.print("1 is not a prime no.");
        } 
        else{
            boolean isprime = true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i == 0){
                    isprime = false;
                }
            }

            if(isprime == true){
                System.out.print(n + " is prime no.");
            }else{
                System.out.print(n+" is not a prime no.");
            }
        }
    }
    
}

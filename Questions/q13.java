import java.util.*;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no. ");
        int n = sc.nextInt();
        int org = n;
        int rev =0;
        while(n>0){
            int last = n%10;
            rev = (rev*10)+last;
            n = n/10;

        }
        if(org == rev){
            System.out.println( org + " is palindrome");
        }else{
            System.out.print( org + " is not a palindrome");
        }
    }
    
}

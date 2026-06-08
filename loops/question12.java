// To find the factorial entered by user
import java.util.*;
public class question12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no.");
        int n = sc.nextInt();
        int x = 1;
        for(int i =1; i<=n; i++){
             x *= i;
        }System.out.println("factorial: " + x);
            

        }
    }
    
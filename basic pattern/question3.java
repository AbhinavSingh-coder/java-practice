

import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no.");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int x = 1;x<=i; x++){
                System.out.print(x);
            }System.out.println();
        }
    }
    
}

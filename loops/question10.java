//display all numbers enter by user except multiple of 10

import java.util.*;
public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter your no.");
            int x = sc.nextInt();
            if(x % 10 == 0){
               continue;
            }System.out.println(x);

        }while(true);
    }
    
}

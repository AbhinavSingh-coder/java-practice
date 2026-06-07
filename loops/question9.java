//enetring a no. till user enter multiple of 10

import java.util.*;
public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter your no.3");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }System.out.println(n);


        }while(true);
           
}
   }
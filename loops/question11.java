//print the multiplication table of no., entered by user

import java.util.*;
public class question11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no.");
        int x = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(i*x);
        }
      }
    }        

//folyd triangle

import java.util.Scanner;

public class question4 {
    public static void folyd_triangle(int n){
        int x = 1;
        for(int i = 1; i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(x+ " ");
                x++;
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no. ");
        int n = sc.nextInt();
        folyd_triangle(n);
    }
    
}

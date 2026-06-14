import java.util.Scanner;

public class question7 {
 public static void rhombus(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
 }    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("enter your no. ");
        int n = sc.nextInt();
         rhombus(n);
 }
}

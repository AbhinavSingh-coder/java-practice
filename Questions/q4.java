import java.util.*;
public class q4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no. ");
        int n = sc.nextInt();
        int factorial =1;
        for(int i =1;i<=n;i++){
            factorial *= i;
        }
        System.out.print("The factorial is " + factorial);

    }
}

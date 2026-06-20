import java.util.*;
public class q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a ");
        int a = sc.nextInt();
        System.out.print("enter b ");
        int b = sc.nextInt();
        System.out.print("enter c ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.print("a is largest");
        }else if(b>c){
            System.out.print("b is largest");
        }else{
            System.out.print("c is largest");
        }
    }
}

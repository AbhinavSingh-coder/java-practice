
import java.util.*;
public class charAt {
    public static void print(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name ");
        String name = sc.nextLine();
        print(name);
        
    }
    
}

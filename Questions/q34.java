import java.util.*;
public class q34 {
    public static boolean palin(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your word ");
        String str = sc.next();
        palin(str);
        if(palin(str)== true){
            System.out.println(str+" is palindrome.");
        }else{
            System.out.println(str+" is not a palindrome.");
        }
    }
    
}

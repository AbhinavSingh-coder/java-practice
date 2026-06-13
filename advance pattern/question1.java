// hollow rectangle.
import java.util.*;
public class question1 {
    public static void hollow_rectangle(int totrows, int totcols){
        for(int i =1; i<=totrows; i++){

             for(int j =1; j<=totcols; j++){

                if(i==1||i == totrows ||j==1 ||j == totcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

             }  System.out.println();     
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows ");
        int totrows = sc.nextInt();
        System.out.print("enter columns ");
        int totcols = sc.nextInt();
    hollow_rectangle(totrows,totcols);
        
    }
    
    
}

//print star pattern


import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. to observe pattern");
        int n = sc.nextInt();
        for(int line = 1; line<=n; line ++){
            for(int star = 1;star<=line; star++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

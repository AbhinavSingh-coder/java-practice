
import java.util.*;
public class question1 {
    public static void main(String[] args) {
        int marks[] = new int[90];
        Scanner sc = new Scanner(System.in);
         marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();
         marks[2] = sc.nextInt();

         int percentage = (marks[0]+marks[1]+marks[2])/3;
         System.out.println("percentage is : " + percentage);
    }
}

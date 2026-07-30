import java.util.*;

public class concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first name ");
        String firstname = sc.next();
        System.out.print("enter your last name ");
        String lastname = sc.next();

        String fullname = firstname +" "+ lastname;
        System.out.println("your full name is "+ fullname);
    }

    
}

//basic operations (creating,input,output)


import java.util.*;
class operations{
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
         marks[0] = sc.nextInt();  //physics
         marks[1] = sc.nextInt();  // maths
         marks[2] = sc.nextInt();  //chemistry

         System.out.println("physics marks : " + marks[0]);
         System.out.println("maths marks : " + marks[1]);
         System.out.println("chemistry marks : " + marks[2]);
    }
}
//function overloading using datatype.

public class question5 {
    public static int sum(int a, int b){
       int add = a+b;
        return add;
    }
    public static float sum(float a, float b){
        float add = a+b;
        return add;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.5f,4.5f));
    }
    
}

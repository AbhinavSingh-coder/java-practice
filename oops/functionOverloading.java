public class functionOverloading {
    public static void main(String[] args) {
        Calculator cals = new Calculator();
        System.out.println(cals.sum(3,2));
        System.out.println(cals.sum(4,8,6));
        System.out.println(cals.sum(8.5f, 4.5f));
        
    }
    
}
class Calculator{
 int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a + b;
    }
    int sum(int a,int b,int c){
        return a+b+c;

    }
}

public class q5 {
    public static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fn = fibnm1 + fibnm2;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fib(23));
        
    }
    
}

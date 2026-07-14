public class q44 {
    public static int clearrange(int i ,int j ,int n){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n &bitmask;
    }
    public static void main(String[] args) {
        clearrange(0, 0, 0);
        
    }
    
}

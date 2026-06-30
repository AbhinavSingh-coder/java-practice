public class q6 {
    public static int clearLastbit(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
       System.out.println(clearLastbit(15, 2)); 
        
    }
    
}

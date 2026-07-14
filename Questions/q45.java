public class q45 {
    public static int countbit(int n, int i){
        int count =0;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n = n>>i;
        }
        return count;
    }
    public static void main(String[] args) {
        countbit(0, 0);
        
    }
    
}

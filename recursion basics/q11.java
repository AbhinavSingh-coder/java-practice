public class q11 {
    public static int tilingproblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertical = tilingproblem(n-1);
        int horizontal = tilingproblem(n-2);
        int totalways = vertical+horizontal;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(4));
        
    }
    
}

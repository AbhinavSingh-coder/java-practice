public class q9 {
    public static int pow(int n,int x){
        if(n==0){
            return 1;
        }
        int pownm1 = pow(n-1,x);
        int p = x*pownm1;
        return p;
    }
    public static void main(String[] args) {
        System.out.println(pow(10, 2));
        
    }
    
}

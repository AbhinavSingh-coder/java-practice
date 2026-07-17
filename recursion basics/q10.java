public class q10 {
    public static int pow(int n , int x){
        if(n==0){
            return 1;
        }
       int halfpow = pow(n/2,x)*pow(n/2,x);
       if(n %2 != 0){
        halfpow = x*halfpow;
       }
       return halfpow;
    }

    public static void main(String[] args) {
        System.out.println(pow(5, 2));
        
    }
}

    


public class q14 {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }else{
            for(int i =2;i<=n-1;i++){
                if(n%i == 0){
                    return false;
                }else{
                    
                }
            }
        }return true;
    }
    public static void range(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String[] args) {
       range(100);
        
    }
}

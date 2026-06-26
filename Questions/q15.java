public class q15 {
    public static void largest(int num[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
        if(max<num[i]){
           max = num[i];
        }
        
    }System.out.println("largest value is "+ max);
    }
    public static void main(String[] args) {
        int num[] = {2,5,3,6,9};
        largest(num);
    }
    
    
}

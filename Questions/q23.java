public class q23 {
    public static void sub(int num[]){
        int max =Integer.MIN_VALUE;
        int sum =0;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for(int i=1;i<num.length;i++){
            prefix[i]= prefix[i-1]+num[i];
       }
       for(int i=0;i<num.length;i++){
        int start =i;
        for(int j=i;j<num.length;j++){
            int end =j;
            sum = start ==0? prefix[end]:prefix[i-1]+num[i];
            if(max<sum){
                max =sum;
            }
        }
       }System.out.println("max sum is "+max);

    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        sub(num);

    }
}

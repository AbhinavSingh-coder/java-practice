public class subarray_sum2 {
    public static void subsum(int num[]){
        int maxsum = Integer.MIN_VALUE;
        int csum=0;
        int prefix[]=new int[num.length];
        prefix[0] = num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j=i;j<num.length;j++){
                int end =j;
                csum =start ==0? prefix[end]:prefix[end]-prefix[start-1];
               
                    if(maxsum<csum){
                        maxsum=csum;
                    }

                
            }
        }
        System.out.println("maxsum" +maxsum);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        subsum(num);
    }
}

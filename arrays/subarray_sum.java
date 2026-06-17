public class subarray_sum {
    public static void subsum(int num[]){
        int maxsum = Integer.MIN_VALUE;
        int csum =0;
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j=i;j<num.length;j++){
                int end =j;
                csum = 0;
                for(int k =start;k<=end;k++){
                    csum +=num[k];
                     }System.out.println(csum);
                     
                     if(maxsum<csum){
                    maxsum = csum;
                }
                                
            }
         }
         System.out.print("max sum" +maxsum);
   
        }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        subsum(num);
    
    }}

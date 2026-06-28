public class q22 {
    public static void sum(int num[]){
        int max=Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j=i;j<num.length;j++){
                int end = j;
                sum=0;
                for(int k=start;k<=end;k++){
                   sum += num[k];
                }
                System.out.println(sum);
                if(max<sum){
                    max = sum;

                }
            }
            System.out.println("max sum is "+ max);
        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        sum(num);
    }
}

public class largest_num {
    public static int getlargest(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest = num[i];
            }if(smallest>num[i]){
                smallest= num[i];
            }

        }System.out.println("smallest value is "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,6,3,4,5};
        System.out.println("largest value is " + getlargest(num));
    }
    
}

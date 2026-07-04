public class q28 {
    public static int search(int arr[]){
       int buy = Integer.MAX_VALUE;
       int maxprofit =0;
       for(int i=0;i<arr.length;i++){
        if(buy<arr[i]){
            int profit = arr[i] - buy;
            maxprofit = Math.max(maxprofit,profit);
            
        }else{
            buy = arr[i];
        }
       }
         return maxprofit;
    }
    
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(search(arr));
        
        

    }}
    


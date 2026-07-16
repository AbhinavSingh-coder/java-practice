public class q6 {
    public static boolean sortedarray(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
       
       return sortedarray( arr,i+1);

    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8};
        System.out.println(sortedarray(arr, 0));
        
    }
    
}

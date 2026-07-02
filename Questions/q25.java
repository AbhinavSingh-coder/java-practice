public class q25 {
    public static void sort(int arr[]){
      for(int i=0;i<arr.length-1;i++){
        int min =i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[min]>arr[j]){
                min = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
      }
    }
     public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,4,1};
        sort(arr);
        print(arr);
    }
    
}

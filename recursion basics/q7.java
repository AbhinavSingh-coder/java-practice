public class q7 {
    public static int Firstocc(int arr[],int key,int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
       return Firstocc(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8,5,9};
        int key =5;
        System.out.println(Firstocc(arr, key, 0));
        
    }
    
}

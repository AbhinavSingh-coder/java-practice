import java.util.Arrays;
public class inbuiltsort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
    int arr[] = {4,3,5,2,1} ;
    Arrays.sort(arr);
    print(arr);
}
}


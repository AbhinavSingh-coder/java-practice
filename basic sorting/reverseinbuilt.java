import java.util.Arrays;
import java.util.Collections;
public class reverseinbuilt {
    public static void print(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {4,3,2,5,1};
        Arrays.sort(arr,Collections.reverseOrder());
        print(arr);
    }
    
}

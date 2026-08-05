

public class mergesort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
     int mid = si+(ei-si)/2;
     mergesort(arr,si,mid);   //left part
     mergesort(arr, mid+1, ei);      //right part
     merge(arr, si,mid, ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){

        //left(0,3) = 4  right(4,6) = 3       6-0+1
        int temp[] = new int[ei-si+1];   //index is 0 based that is the reason why we write +1
        int i = si;            //iterator for left
        int j = mid+1;         //iterator for right
        int k =0;              //iterator for temp arr


        while(i<=mid && j<=ei){        //copy elements
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i<=mid){               //for leftover element of 1 sort part
            temp[k++] = arr[i++];
        }

        while(j<=ei){                //for leftover element of 2 sorted part
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k =0, i=si;k<temp.length;k++, i++){
        arr[i] = temp[k]; 
        }
    }
   public static void main(String[] args) {
    int arr[] = {6,3,9,5,2,8};
    mergesort(arr, 0, arr.length-1);
    printarr(arr);
    
   } 
}

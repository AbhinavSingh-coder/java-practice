public class q32 {
    public static void getsum(int arr[][]){
        int sum =0;
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
          if(i ==1){
            sum +=arr[i][j];
          }
        }
      }
      System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,4,9},
                    {11,4,3},
                    {2,2,3}};
                    getsum(arr);
    }
    
}

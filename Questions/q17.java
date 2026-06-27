public class q17 {
    public static int find(int num[], int key){
        for(int i=0;i<=num.length;i++){
            if(num[i] == key){
                return i;

            }
        }return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        int key = 8;
       System.out.println(find(num,key));
    }
    
}

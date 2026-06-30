public class q5 {
  public static int sel(int n,int i){
    int bitmask= 1<<i;
    return n|bitmask;
  }
  public static int clear(int n,int i){
    int bitmask = ~(1<<i);
    return n& bitmask;

  }
    public static int update(int n,int i,int newbit ){
      if(newbit == 0){
        return clear(n, i);
      }else{
        return sel(n, i);
      }
    }
    public static void main(String[] args) {
      System.out.println(update(10, 2, 1));
        
    }
}

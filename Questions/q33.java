public class q33 {
    public static void trans(int matrix[][]){
        int n = matrix.length,m = matrix[0].length;
        int transpose[][] = new int[m][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              transpose[j][i] = matrix[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                           {4,5,6},
                        {7,8,9}};
                        
                        
                        }
    }
    


public class sum_and_avrage_2darray {
    public static void main(String[] args) {
      int [][] a=arrayutility.inputarray2d();  
      int avg= sum2darray(a);
      System.out.println("your 2D array avrage is " +avg);
    }
    public static int sum2darray(int[][] a){
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
                count++;
            }
         }
       return sum/count;
    }
}

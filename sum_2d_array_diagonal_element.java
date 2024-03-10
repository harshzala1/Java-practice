public class sum_2d_array_diagonal_element {
    public static void main(String[] args) {
        int[][] a=arrayutility.inputarray2d();
        long sum = sumofdiagonal(a);
        System.out.println("sum of diagonal element is "+sum);

    }
    public static long sumofdiagonal(int[][] a){
        long left = sumofleftdiagonal(a);
        long right = sumofrightdiagonal(a);
        long sum =  left+right;
        if(a.length%2!=0){
             int ind = a.length/2;
             sum-=a[ind][ind];
        }
            return sum;
    }
    public static long sumofrightdiagonal(int[][] a){
        long sum =0;
        int i =0;
        while(i<a.length){
           int col=(a.length-1)-i;
           sum+=a[i][col];
            i++;
        }
        return sum;
    
    }
    public static long sumofleftdiagonal(int[][] a){
        long sum =0;
        int i =0;
        while(i<a.length){
            sum+=a[i][i];
            i++;
        }
        return sum;
    }
}



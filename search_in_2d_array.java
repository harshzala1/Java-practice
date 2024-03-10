import java.util.Scanner;
public class search_in_2d_array {
    public static void main(String[] args) {
        int [][] a = arrayutility.inputarray2d();
        System.out.println("enter the number that your want to search in 2d array");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        boolean ans = search_number_2d_array(a,n);
        System.out.println("your number is in array=    "+ans);
     }
    public static boolean search_number_2d_array(int [][] a,int n){
       for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
              if(a[i][j]==n){
                return true;
              }
            }
         }

        return false;
    }
}

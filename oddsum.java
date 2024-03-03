import java.util.Scanner;
public class oddsum {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= oddsu(n);
        System.out.println(sum);
     
    }
    public static int oddsu(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
              sum=sum+i;
            }
         }
         return sum;
   }
}

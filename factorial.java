import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(+(factorial(n)));


    }
    public static int factorial(int x){
        int ans =1;
        for(int i=1;i<=x;i++){
            ans=ans*i;
            }
         return ans;
    }
}

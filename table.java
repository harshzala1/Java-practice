import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner n=new Scanner(System.in);
        int a = n.nextInt();
        table(a);
    }
    public static void table(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x+"x"+i+"="+(x*i));
        }


    }
}

import java.util.Scanner;
public class numberoccurs_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element you want to check");
        int n=sc.nextInt();
        int [] b = input();
        int occ=occur(b,n);
        System.out.println("numberof element  " +n+"  occcurs  "+occ+"  times");

    }
    public static int[] input(){
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] b= new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the element of array");
            b[i]=sc.nextInt();
        }

        return b;
    }
    public static int occur(int [] b,int n){
        int occ=0;
        for(int i=0;i<b.length;i++){
            if(b[i]==n){
                occ++;
            }
     }
        return occ;
    }
}
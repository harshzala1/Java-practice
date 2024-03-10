import java.util.Scanner;
public class arrayutility{
    public static int[] inputarray(){
        Scanner input=new Scanner(System.in);
        System.out.println("pleasae enter the size of array");
        int size = input.nextInt();
        int [] a = new int [size];
        for(int i=0;i<size;i++){
            System.out.println("enter the element number"+i);
            a[i]=input.nextInt();

        }
         return a;
    }
    public static void arrayprint(int [] b){
        for(int i=0;i<b.length;i++){
            System.out.println("here is your"+i+ "element " +b[i]);
        }

    }
    public static int [] arrayreverse(int[] a){
        int n = a.length;
        int [] b=new int [n];
        for(int i=0;i<a.length;i++){
            b[i]=a[n-1];
            n--;
        }

        return b;
    }
    public static void optreverse(int[] b){
        for(int i=0;i<b.length/2;i++){
        int temp=b[i];
        b[i]=b[(b.length-1)-i];
        b[(b.length-1)-i]=temp;
        }
      
    }
    public static int[][] inputarray2d(){
        Scanner input=new Scanner(System.in);
        System.out.println("pleasae enter the raw of array");
        int row = input.nextInt();
        System.out.println("pleasae enter the colmn of array");
        int colm = input.nextInt();
        int[][] a = new int [row][colm];
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                System.out.println("enter the element a["+(i)+"]["+(j)+"] ===");
                a[i][j]=input.nextInt();
            }
         }
       
         return a;
    }

}
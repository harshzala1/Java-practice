import java.util.Scanner;
public class avrage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] numarray =input();
        int [] avg=avrage();
       


    public static int[] input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int [] a = new int [size];
        for(int i=0;i<size;i++){
            System.out.println("enter the element for array");
            a[i]=sc.nextInt();
        }  
        return a;
    }


    public static int[] avrage(){
        int sum=0;
        for(int i=0;i<numarray.length;i++){
           
            sum=sum+numarray[i];
        }   
        int avg= sum/(numarray.length) ;
        System.out.println("avg is "+(avg));
    }

    

}

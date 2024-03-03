import java.util.Scanner;
public class minmax_array {
    public static void main(String[] args) {
        System.out.println("welcome to min max program");
        int [] numarray=input();
        int minans=min(numarray);
        int maxans=max(numarray);
        System.out.println("minimum number is "+(minans));
        System.out.println("maximum number is "+(maxans));
    }
    
    public static int[] input(){
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int [] numarray= new int [size];
        for(int i=0;i<numarray.length;i++){
            System.out.println("enter the element of array");
            numarray[i]=sc.nextInt();
        }
        return numarray;
    }

    public static int min(int[] numarray){
        int min =numarray[0];
        for(int i=0;i<numarray.length;i++){
             if(numarray[i]<min){
                min=numarray[i];
            }
        }
            return min;
    }

    public static int max(int[] numarray){
        int max =numarray[0];
         for(int i=0;i<numarray.length;i++){
             if(numarray[i]>max){
                max=numarray[i];
            }
        }
             return max;
    }
}


import java.util.Scanner;
public class arraysearching {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the element you want to search");
        int n=sc.nextInt();
        int [] a={5,8,5,8,5,8,5,8,57,45,14,15,75,85,62};
        boolean yesorno = hakna( a,  n);
        if(yesorno){
            System.out.println("array is found");
        }
        else{
            
            System.out.println("array not is found");
        }
        
    }
    public static boolean hakna(int [] a ,int n){
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                return true;
            }
        }

        return false;
    }
}

import java.util.Scanner;
public class Arrayelementdealit {
    public static void main(String[] args) {
        int [] a = arrayutility.inputarray();
        System.out.println("enter the element that you want to deleat");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int [] b=dealitarray(a, n);
        System.out.println("here is your edited array");
        arrayutility.arrayprint(b);
        
        
    }
    public static int[] dealitarray(int[] b,int n){
       
        int occ = numberoccurs_array.occur(b,n);
        if(occ==0){
            return b;
       }
       else{
        int j=0;
        int arraysize=b.length-occ;
        int [] newarray = new int[arraysize];
        for(int i=0;i<b.length;i++){
            if(n!=b[i]){
                newarray[j]=b[i];
                j++;
            }
        }
        return newarray;
       }
       
      }
    
    
    
    
}
    


public class array_palindrom {
    public static void main(String[] args) {
            int [] a=arrayutility.inputarray();
            boolean ans = arraypelindrom(a);
            System.out.println("your array is palindrom"+ans);
           
    }
    public static boolean arraypelindrom(int [] a){
            int [] b=arrayutility.arrayreverse(a);
            for(int i=0;i<a.length;i++){
               if(a[i]!=b[i]){
                 return false;
               }
            }
        return true;
    }
}


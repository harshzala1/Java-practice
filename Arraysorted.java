public class Arraysorted {
    public static void main(String[] args) {
        int [] b = arrayutility.inputarray();
        boolean incr = isincreasing(b);
        boolean decr = isdecreasing(b);
        if(incr||decr){
            System.out.println("your array is sorted");
        }
        else{
            System.out.println("your array is not sorted");
        }
   
    }
    public static boolean isincreasing(int[] b){
       
        for(int i=1;i<b.length;i++){
          if(b[i-1]>=b[i]){
            return false;
          }
        }
         return true ;
    }
    public static boolean isdecreasing(int [] b){
        for(int i=1;i<b.length;i++){
            if(b[i-1]<=b[i]){
              return false;
            }
          }
           return true ;
         
       }
       
    
}

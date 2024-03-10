public class array_sort_merge {
    public static void main(String[] args) {
        int [] a=arrayutility.inputarray();
        System.out.println("enter the second array");
        int [] b=arrayutility.inputarray();
        int [] newarray=sortmerge(a,b);
        arrayutility.arrayprint(newarray);

    }
    public static int[] sortmerge(int[] a,int [] b){
        int size=a.length+b.length;
        int [] ansarr= new int[size];
        int i=0,j=0,k=0;
        while(i<a.length || j<b.length)     {
            if(j==b.length || (i<a.length &&  a[i]<b[j])){
                 ansarr[k]=a[i];
                 i++;
                 k++;
                 }
            else{
                ansarr[k]=b[j];
                k++;
                j++;
                 }

        }
        return ansarr;
    }
}

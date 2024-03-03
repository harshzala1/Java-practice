import java.util.Scanner;
 class multiplication{
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("enter the value");
        int  x =n.nextInt(); 
        multi(x);   
        

    }
    public static void multi(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x+"x"+i+"="+(x*i));
        }


    }
}
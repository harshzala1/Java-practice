public class driver{
    public static void main(String[] args) {
     car Swift = new car();
    
     
     
     Swift.addfuel(6);
     Swift.start().drive();

        System.out.println(Swift.currentfuel);
    }
}  
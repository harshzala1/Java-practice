public class car_driving_class{
    int noofwheel;
    int noofsheat;
    String colour;
    float maxspeed;
    float currentfuel;
    public void drive(){
        System.out.println("car is driving");
        currentfuel--;
    }
    public void addfuel(float fuel){
        currentfuel=fuel+currentfuel;
    }
    public static void main(String[] args) {
        car_driving_class mycar = new car_driving_class();
    }
}
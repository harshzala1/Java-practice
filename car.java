public class car{
    int noofwheel;
    int noofsheat;
    String colour;
    float maxspeed;
    float currentfuel;

    public car start(){
        if(currentfuel==0){
            System.out.println("car is out of fuel,please refule");
          
        }
        else if(currentfuel<5){
            System.out.println("car is in reserved mode,please refuel");
           
        }
        else{
            System.out.println("car is starteddd........bruh");
          
        }
        return this;
    }
    public  void drive(){
        currentfuel--;
        System.out.println("car is driving");

    }
    public void addfuel(float currentfuel){
     this.currentfuel+=currentfuel;
      
    }
    
}
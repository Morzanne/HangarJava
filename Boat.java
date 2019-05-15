public class Boat extends Vehicle{

    public Boat(String brand, int kilometers){
        super(brand, kilometers);
    }

    public String doStuff(){
        return "Je suis une "+ getBrand() +" et je fais pas vroom vroom mais gloups gloups !";
    }
}
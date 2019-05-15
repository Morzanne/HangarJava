public class Car extends Vehicle{

    public Car(String brand, int kilometers){
        super(brand, kilometers);
    }

    public String doStuff(){
        return "Je suis une "+ getBrand() +" et je fais vroom vroom !";
    }
}
public class Hangar{

    public static void main(String[] args){

        Car BMW = new Car("BMW",100);
        Car Citadine = new Car("Vielle renault citadine", 0);
        Boat Inconnu = new Boat("Unknow brand", 100);

        System.out.println(BMW.doStuff());
        System.out.println(Citadine.doStuff());
        System.out.println(Inconnu.doStuff());

        Inconnu.setBrand("Hollandais Volant");
        System.out.println(Inconnu.doStuff());

    }
}
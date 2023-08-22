public class Hangar {
    public static void main(String[] args) {
        Car myCar =  new Car( "Clio ", 15000);
        Boat myBoat =  new Boat("Elizabeth",2000000) ;
        System.out.println(myCar.doStuff());
        System.out.println(myBoat.doStuff());
    }
}
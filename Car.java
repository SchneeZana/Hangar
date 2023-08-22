public class Car extends Vehicle {
    public Car(String brand, int kilometers) {
        super(brand, kilometers);

    }

    @Override
    public String doStuff() {

        return "I´m " + getBrand() + " and i go zoom zoom zoom!";
    }

}

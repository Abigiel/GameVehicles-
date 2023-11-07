public class Car extends Vehicle {

    boolean manual;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double speed, String modeOfTransport, String fuelType, int damage, String make, String model, boolean manual) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, speed, modeOfTransport, fuelType, damage, make, model);
        this.manual = manual;
    }
    public boolean isManual() {
        return manual;
    }
    public void setManual(boolean manual) {
        this.manual = manual;
    }



}

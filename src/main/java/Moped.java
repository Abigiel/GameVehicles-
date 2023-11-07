public class Moped extends Vehicle {
    boolean hasPedals;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double speed, String modeOfTransport, String fuelType, int damage, String make, String model, boolean hasPedals) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, speed, modeOfTransport, fuelType, damage, make, model);
        this.hasPedals = hasPedals;
    }

    public boolean isHasPedals() {
        return hasPedals;
    }

    public void setHasPedals(boolean hasPedals) {
        this.hasPedals = hasPedals;
    }


}

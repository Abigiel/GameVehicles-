public class SemiTruck extends Vehicle{
    boolean isManual;
    int cargoSpace;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double speed, String modeOfTransport, String fuelType, int damage, String make, String model, boolean isManual, int cargoSpace) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, speed, modeOfTransport, fuelType, damage, make, model);
        this.isManual = isManual;
        this.cargoSpace = cargoSpace;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setIsManual(boolean manual) {
        isManual = manual;
    }





    public int getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(int cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

}

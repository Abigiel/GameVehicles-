public class Hovercraft extends Vehicle{
    int hoverHeight;
    String currentSurface;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double speed, String modeOfTransport, String fuelType, int damage, String make, String model, int hoverHeight, String currentSurface) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, speed, modeOfTransport, fuelType, damage, make, model);
        this.hoverHeight = hoverHeight;
        this.currentSurface = currentSurface;
    }

    public int getHoverHeight() {
        return hoverHeight;
    }

    public void setHoverHeight(int hoverHeight) {
        this.hoverHeight = hoverHeight;
    }

    public String getCurrentSurface() {
        return currentSurface;
    }

    public void setCurrentSurface(String currentSurface) {
        this.currentSurface = currentSurface;
    }


}

package parkinglot;

public enum ParkableVehicles {
    Bike(1), Car(2), Bus(4);
    private final int spots;

    ParkableVehicles(int spots) {
        this.spots = spots;
    }

    public int getSpots() {
        return spots;
    }
}

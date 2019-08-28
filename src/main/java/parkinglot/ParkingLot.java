package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int occupiedSpots = 0;
    private final int SPOTS = 20;
    List<Vehicle> vehicles = new ArrayList<>();

    public boolean park(Vehicle vehicle) {
        if (isAvailable(vehicle.getSpotsNeeded())) {
            vehicles.add(vehicle);
            occupiedSpots += (vehicle.getSpotsNeeded());
            return true;
        }
        System.out.println("PARKING FULL");
        return false;
    }

    public int getOccupiedSpots() {
        return occupiedSpots;
    }

    public int getSPOTS() {
        return SPOTS;
    }

    private boolean isAvailable(int spotsNeeded) {
        int emptySpots = getSPOTS() - getOccupiedSpots();
        return emptySpots >= spotsNeeded;
    }

}

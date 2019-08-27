package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int TOTAL_SPOTS = 20;
    private int occupiedSpots = 0;

    List<Vehicle> vehicles = new ArrayList<>();

    public String parked(String vehicleType, int spotsNeeded) {
        if (isSpotAvailable(spotsNeeded)) {
            Vehicle vehicle = new Vehicle(vehicleType, spotsNeeded);
            vehicles.add(vehicle);
            setOccupiedSpots(spotsNeeded);
            return "Vehicle Parked";
        }
        return "Spot Not Available";
    }

    private boolean isSpotAvailable(int spotsNeeded) {
        int emptySpots = getTOTAL_SPOTS() - getOccupiedSpots();
        return emptySpots >= spotsNeeded;
    }

    private int getTOTAL_SPOTS() {
        return TOTAL_SPOTS;
    }

    private int getOccupiedSpots() {
        return occupiedSpots;
    }

    private void setOccupiedSpots(int occupiedSpots) {
        this.occupiedSpots += occupiedSpots;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}

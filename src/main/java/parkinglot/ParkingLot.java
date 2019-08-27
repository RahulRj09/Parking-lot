package parkinglot;

public class ParkingLot {
    private Spot spot = new Spot();

    private boolean isAvailable(int spotsNeeded) {
        int emptySpots = spot.getSPOTS()-spot.getOccupiedSpots();
        return emptySpots>=spotsNeeded;
    }

    public boolean park(ParkableVehicles vehicle) {
        if(isAvailable(vehicle.getSpots())){
            spot.setOccupiedSpots(vehicle.getSpots());
            return true;
        }
        return false;
    }
}

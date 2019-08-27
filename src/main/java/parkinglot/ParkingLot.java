package parkinglot;

public class ParkingLot {
    private Spot spot = new Spot();

    public boolean park(Vehicle vehicle) {
        if(isAvailable(vehicle.getSpotsNeeded())){
            spot.setOccupiedSpots(vehicle.getSpotsNeeded());
            return true;
        }
       return false;
    }

    private boolean isAvailable(int spotsNeeded) {
        int emptySpots = spot.getSPOTS()-spot.getOccupiedSpots();
        return emptySpots>=spotsNeeded;
    }

}

package parkinglot;

public class Spot {
    private final int SPOTS = 20;
    private int occupiedSpots = 0;

    public int getSPOTS() {
        return SPOTS;
    }

    public int getOccupiedSpots() {
        return occupiedSpots;
    }

    public void setOccupiedSpots(int occupiedSpots) {
        this.occupiedSpots += occupiedSpots;
    }
}

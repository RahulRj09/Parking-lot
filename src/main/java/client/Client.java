package client;

import parkinglot.*;

public class Client {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        System.out.println(parkingLot.park(ParkableVehicles.Bike));
    }
}
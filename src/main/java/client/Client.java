package client;

import parkinglot.*;

public class Client {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Vehicle bus = new Bus();
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        System.out.println(parkingLot.park(bus));
        System.out.println(parkingLot.park(car));
        System.out.println(parkingLot.park(bike));
    }
}

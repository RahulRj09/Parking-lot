package client;

import parkinglot.*;

public class Client {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();
        Bus bus = new Bus();
        Bike bike = new Bike();
        parkingLot.park(bike);
        parkingLot.park(car);
        parkingLot.park(bus);
        parkingLot.unPark(car);
        parkingLot.unPark(bus);
    }
}
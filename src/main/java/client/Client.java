package client;

import parkinglot.*;

public class Client {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car("12345");
        Bus bus = new Bus("12345");
        Bike bike = new Bike("12345");
        parkingLot.park(bike);
        parkingLot.park(car);
        parkingLot.park(bus);
        parkingLot.unPark(car);
        parkingLot.unPark(bus);
    }
}
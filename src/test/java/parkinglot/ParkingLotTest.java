package parkinglot;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParkingLotTest {
    @Test
    public void vehicleShouldBePark() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        assertTrue(parkingLot.park(car));
    }

    @Test
    public void vehicleShouldBeUnPark() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.park(car);
        assertTrue(parkingLot.unPark(car));
    }

    @Test
    public void vehicleShouldNotInParkingLot() {
        Car car = new Car();
        Car car1 = new Car();
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.park(car);
        assertFalse(parkingLot.unPark(car1));
    }

    @Test
    public void parkingLotShouldBeVacant() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        assertFalse(parkingLot.unPark(car));
    }

    @Test
    public void parkingLotShouldBeFull(){
        Bus bus = new Bus();
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new Bus();
        Bus bus4 = new Bus();
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.park(bus);
        parkingLot.park(bus1);
        parkingLot.park(bus2);
        parkingLot.park(bus3);
        parkingLot.park(bus4);
        assertFalse(parkingLot.park(car));
    }

}

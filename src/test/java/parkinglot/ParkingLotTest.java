package parkinglot;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParkingLotTest {
    @Test
    public void vehicleShouldBePark() {
        Car car = new Car("12344");
        ParkingLot parkingLot = new ParkingLot();
        assertTrue(parkingLot.park(car));
    }
    @Test
    public void vehicleShouldBeUnPark() {
        Car car = new Car("12344");
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.park(car);
        assertTrue(parkingLot.unPark(car));
    }
    @Test
    public void vehicleShouldNotInParkingLot(){
        Car car = new Car("12344");
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.park(car);
        Car car1 = new Car("12344");
        assertFalse(parkingLot.unPark(car1));
    }
}

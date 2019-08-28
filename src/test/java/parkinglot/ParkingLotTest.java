package parkinglot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParkingLotTest {
    @Test
    public void vehicleShouldBePark() {
        Car car = new Car("12344");
        ParkingLot parkingLot = new ParkingLot();
        assertEquals(true, parkingLot.park(car));
    }
}

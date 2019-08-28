package parkinglot;

public class Bike extends Vehicle {
    public Bike(String licenceNumber) {
        spotsNeeded = 1;
        this.licenceNumber = licenceNumber;
    }
}

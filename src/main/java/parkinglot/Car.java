package parkinglot;

public class Car extends Vehicle {
    public Car(String licenceNumber) {
        spotsNeeded = 2;
        this.licenceNumber = licenceNumber;
    }
}

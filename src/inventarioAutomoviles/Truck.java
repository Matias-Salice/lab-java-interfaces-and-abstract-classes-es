package inventarioAutomoviles;

public class Truck extends Car {
    protected double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return "Truck [VIN: " + vinNumber + ", Make: " + make + ", Model: " + model + ", Mileage: " + mileage + ", Towing: " + towingCapacity + " tons]";
    }
}
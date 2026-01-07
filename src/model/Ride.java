package model;

public abstract class Ride {
    private String name;
    private double pricePerKM;

    public Ride(String name, double pricePerKM) {
        this.name=name;
        this.pricePerKM=pricePerKM;
    }

    public String getName() {
        return name;
    }
    public double getPricePerKM() {
        return pricePerKM;
    }

    public abstract double calculateFare(double distance);
}

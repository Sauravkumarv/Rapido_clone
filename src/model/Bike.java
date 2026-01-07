package model;

public class Bike extends Ride {

public Bike(){
    super("Bike",8);
}
@Override
public double calculateFare(double distance) {
    return distance*getPricePerKM();
}
}

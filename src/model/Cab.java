package model;

public class Cab extends Ride {

    public Cab(){
        super("Cab",20);
    }
    @Override
    public double calculateFare(double distance){
        return distance*getPricePerKM();
    }
}

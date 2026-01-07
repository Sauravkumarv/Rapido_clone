package model;

public class Auto extends Ride {

    public Auto() {
        super("Auto",12);
    }
    @Override
    public double calculateFare(double distance){
   return distance*getPricePerKM();
    }
}

package service;

import model.Auto;
import model.Bike;
import model.Cab;
import model.Ride;

import java.util.ArrayList;
import java.util.List;

public class RideService {
    public List<Ride>  getAvailableRides(){
      List<Ride> rides = new ArrayList<>();
      rides.add(new Bike());
        rides.add(new Auto());
        rides.add(new Cab());
        return rides;
    }
}

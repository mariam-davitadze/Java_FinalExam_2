package ge.edu.btu;
import java.util.ArrayList;
import java.util.List;

public class Train {
    List<Passenger> PassengerList = new ArrayList<>();

    public List<Passenger> getPassengerList() {
        return PassengerList;
    }

    public void AddPassenger(Passenger passenger) {
        if (passenger.ticket)
            PassengerList.add(passenger);
    }
}

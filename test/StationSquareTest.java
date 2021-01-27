import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Assert;
import org.junit.Test;

public class StationSquareTest {
    Train train = new Train();

    @Test
    public void check_if_add_passenger_without_ticket() {
        Passenger passenger = new Passenger("Danil", false);
        train.AddPassenger(passenger);
        Assert.assertEquals(0, train.getPassengerList().size());
    }

    @Test
    public void check_if_add_passenger_with_ticket() {
        Passenger passenger = new Passenger("Mariam", true);
        train.AddPassenger(passenger);
        Assert.assertEquals(1, train.getPassengerList().size());
    }

}

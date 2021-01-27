package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passenger gio = new Passenger("Gio", true);
        Passenger nika = new Passenger("Nika", false);
        Passenger ana = new Passenger("Ana", true);

        Train train = new Train();

        train.AddPassenger(gio);
        train.AddPassenger(nika);
        train.AddPassenger(ana);

        for (Passenger passenger:train.getPassengerList()) {
            System.out.println(passenger.getName());
        }

    }

}

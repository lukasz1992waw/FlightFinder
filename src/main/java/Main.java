public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("15:00","18:00");
        System.out.println(flight1.getFlight());
    }
}

class Flight {
    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getFlight () {
        return "Departure time: "+ departure + " Arrival time: " + arrival;
    }
}

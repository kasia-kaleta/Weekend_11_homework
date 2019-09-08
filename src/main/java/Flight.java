import java.util.ArrayList;

public class Flight {

    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private PlaneType plane;
    private ArrayList<Passenger>passengers;

    public Flight(String flightNo, String destination, String departureAirport, String departureTime, PlaneType plane){
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
    }


}

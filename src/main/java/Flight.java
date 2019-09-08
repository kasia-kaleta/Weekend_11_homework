import java.util.ArrayList;

public class Flight {

    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Plane plane;
    private ArrayList<Passenger>passengers;

    public Flight(String flightNo, String destination, String departureAirport, String departureTime, Plane plane){
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
    }

    public Plane getPlane(){
        return plane;
    }

    public Passenger getPassenger(int index){
        return passengers.get(index);
    }

    public int checkAvailability(){
        return this.plane.getPlaneCapacity() - this.passengerCount();
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public void bookPassenger(Passenger passenger){
        if (this.checkAvailability() > 0){
            this.passengers.add(passenger);
        }
    }




}

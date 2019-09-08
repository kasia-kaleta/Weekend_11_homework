import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Plane plane;
    private Flight flight;
    private Passenger passenger;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.AIRBUSA380);
        flight = new Flight("FR756", "DBX", "GLA", "11:00", plane);
        passenger = new Passenger("Rachel Greene", 1);
    }

    @Test
    public void canCheckAvailability(){
        assertEquals(555, flight.checkAvailability());
    }

    @Test
    public void checkListOfBookedPassengers(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }




}

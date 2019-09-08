import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Plane plane;
    private Flight flight;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.AIRBUSA380);
        flight = new Flight("FR756", "DBX", "GLA", "11:00", plane);
        flight.bookPassenger(new Passenger("Rachel Greene", 1));
        flight.bookPassenger(new Passenger("Ross Gellar", 2));
    }

    @Test
    public void canCalculateReservedBaggageWeightPerPassenger(){
        assertEquals(504, FlightManager.calculateReservedBaggageWeightPerPassenger(flight));
    }

    @Test
    public void checkNoOfBagsOnFlight(){
        assertEquals(3, FlightManager.calculateBagsOnFlight(flight));
    }

    @Test
    public void canCalculateWeightOfBookedBags(){
        assertEquals(1512, FlightManager.calculateWeightOfBookedBags(flight));
    }

    @Test
    public void canCalculateRemainingAvailableBaggageWeight(){
        assertEquals(278488, FlightManager.calculateRemainingAvailableBaggageWeight(flight));
    }


}

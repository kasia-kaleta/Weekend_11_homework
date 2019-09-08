import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Plane plane;
    private Flight flight;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.AIRBUSA380);
        flight = new Flight("FR756", "DBX", "GLA", "11:00", plane.getPlaneType());
    }

    @Test
    public void canCheckAvailability(){
        assertEquals(555, flight.checkAvailability());
    }




}

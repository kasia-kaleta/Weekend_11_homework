import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetPlaneTotalWeight(){
        plane = new Plane(PlaneType.AIRBUSA320);
        assertEquals(73500, plane.getPlaneTotalWeight());
    }

    @Test
    public void canGetPlaneCapacity(){
        plane = new Plane(PlaneType.AIRBUSA380);
        assertEquals(555, plane.getPlaneCapacity());
    }


}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Passenger passenger1;

    @Before
    public void setup(){
        plane1 = new Plane(PlaneType.BOEING747);
        passenger1 = new Passenger("Steve", 2);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(10, plane1.getCapacity());
    }
}

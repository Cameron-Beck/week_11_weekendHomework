import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {


    Flight flight1;
    Passenger passenger1;

    @Before
    public void setup(){
        flight1 = new Flight("FR756", "EDI","GLA","12:00");
        passenger1 = new Passenger("Steve", 2);
    }



    @Test
    public void canGetFLightNUmber(){
        assertEquals("FR756", flight1.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("EDI", flight1.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("GLA", flight1.getDepartureAirport());
    }
}

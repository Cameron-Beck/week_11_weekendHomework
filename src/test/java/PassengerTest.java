import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Flight flight1;
    Passenger passenger1;

    @Before
    public void setup(){
        flight1 = new Flight("FR756", "EDI","GLA","12:00");
        passenger1 = new Passenger("Steve", 2);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Steve", passenger1.getPassengerName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger1.getNumberOfBags());
    }

}

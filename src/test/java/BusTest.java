import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;

    @Before
    public void before(){
        bus = new Bus( "Glasgow Central");
        passenger = new Person();
    }
    @Test
    public void howManyPeopleAreOnTheBus(){
                assertEquals(0, bus.passengerCount());
    }

}

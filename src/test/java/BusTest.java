import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;

    @Before
    public void before() {
        bus = new Bus("Glasgow Central");
        passenger = new Person();
    }

    @Test
    public void howManyPeopleAreOnTheBus() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengerIfThereIsSpaceInTheBus() {
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canNotAddPassengerIfThereIsNoSpaceInTheBus(){
        bus.setCapacity(1);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }
@Test
    public void canRemoveAPassenger(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(2, bus.passengerCount());
        bus.removePassenger(passenger);
        assertEquals(1, bus.passengerCount());
}
}

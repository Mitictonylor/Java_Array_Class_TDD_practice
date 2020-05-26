import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person passenger;
    private Bus bus;

    @Before
    public void before(){
        busStop = new BusStop("Glasgow Central");
        passenger = new Person();
        bus = new Bus("Paisley");
    }

    @Test
    public void canAddAPerson(){
        busStop.addPersonToTheQueue(passenger);
        assertEquals(1, busStop.getSizeOfTheQueue());
    }
    @Test
    public void canRemoveAPerson(){
        busStop.addPersonToTheQueue(passenger);
        busStop.addPersonToTheQueue(passenger);
        assertEquals(2, busStop.getSizeOfTheQueue());
        busStop.removePersonToTheQueue();
        assertEquals(1, busStop.getSizeOfTheQueue());
    }
    @Test
    public void checkIfAPassengerLeaveTheQueueAndEnterInTheBus(){
        busStop.addPersonToTheQueue(passenger);
        busStop.addPersonToTheQueue(passenger);
        bus.pickUp(busStop);
        assertEquals(1, busStop.getSizeOfTheQueue());
        assertEquals(1, bus.passengerCount());
    }
}

import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;


    public Bus(String destination){
        this.destination = destination;
        this.capacity = 40;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person passenger) {
        if (passengerCount() < this.capacity) {
            this.passengers.add(passenger);
        }
    }

    public void setCapacity(int newCapacity){
        this.capacity = newCapacity;
    }

}

import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int getSizeOfTheQueue(){
        return this.queue.size();
    }
    public void addPersonToTheQueue(Person person){
        this.queue.add(person);
    }
    public Person removePersonToTheQueue(){
       return this.queue.remove(0);
    }

}

import java.util.ArrayList;
import java.util.List;


public class Room extends Manage{
    private int amountOfPerson;
    private int roomNumber;
    protected List<Person> persons;
    public Room(){
        persons = new ArrayList<Person>();
    }

    public Room(int amountOfPerson, List<Person> persons, int roomNumber) {
        this.amountOfPerson = amountOfPerson;
        this.persons = persons;
        this.roomNumber = roomNumber;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getAmountOfPerson() {
        return amountOfPerson;
    }
    public void setAmountOfPerson(int amountOfPerson) {
        this.amountOfPerson = amountOfPerson;
    }
    public List<Person> getPersons() {
        return persons;
    }
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void deletePersonByPassport(String passport){
        Person person = this.persons.stream().filter(o -> o.getPassport().equals(passport)).findFirst().orElse(null);
        if(person != null){
            System.out.println(person.toString());
            this.persons.remove(person);
        }
    }
    public void deletePersonByRoom(){
        persons.clear();
    }
    @Override
    public String toString() {
        return " Room number: " + roomNumber +  ", information of the persons in the room: \n"
         + persons;
    }
}

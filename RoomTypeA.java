import java.util.List;

public class RoomTypeA extends Room{
    public RoomTypeA(int amountOfPerson, List<Person> persons, int roomNumber){
        super(amountOfPerson, persons,roomNumber);
    }
     @Override
     public String toString() {
         return "Room type A: 19, 20";
     }

}

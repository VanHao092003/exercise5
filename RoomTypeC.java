import java.util.List;

public class RoomTypeC extends Room{
    public RoomTypeC(int amountOfPerson, List<Person> persons, int roomNumber ){
        super(amountOfPerson, persons,roomNumber);
    }
     @Override
     public String toString() {
         return "Room type C: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13";
     }
}

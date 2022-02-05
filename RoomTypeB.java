import java.util.List;

public class RoomTypeB extends Room{

        public RoomTypeB(int amountOfPerson, List<Person> persons, int roomNumber){
            super(amountOfPerson, persons,roomNumber);
        }
         @Override
         public String toString() {
             return "Room type B: 14, 15, 16, 17, 18";
         }
    }

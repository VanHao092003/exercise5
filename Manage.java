import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Manage {
    public static final int ROOM_OF_NUMBERS = 20;
    private List<Room> rooms;
    public Manage(){
        rooms = new ArrayList<>();
    }
    public void addPerson(Room room){
        this.rooms.add(room);
    }

    public void deleteInformationOfPersonInRoom(int roomNumber){
        Room room = this.rooms.stream().filter(o -> o.getRoomNumber() == roomNumber).findFirst().orElse(null);
        if(room != null){
            System.out.println("Room you have just removed information of customer: "+room.toString());
            room.deletePersonByRoom();
        }
        else System.out.println("invalid");
    }



    public void deleteInformationOfCustomerByPassport(String passport){
        Room room = this.rooms.stream().filter(o -> o.getPersons().stream().filter(i -> i.getPassport() == passport)).findFirst().orElse(null);

    }

    @Override
    public String toString() {
        return "information: " + rooms.toString();
    }

}

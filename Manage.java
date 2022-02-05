import java.util.ArrayList;
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

    public Boolean deleteInformationOfPersonByPassport(int roomNumber){
        Room room = this.rooms.stream().filter(o -> o.getRoomNumber() == roomNumber).findFirst().orElse(null);

        if(room == null){
            return false;
        }
        else {
            this.rooms.remove(room.)
        }
    }
    @Override
    public String toString() {
        return "information: " + rooms.toString();
    }


}

import java.util.HashMap;

public class Manage {
    public static final int ROOM_OF_NUMBERS = 20;
    public HashMap<Integer, Boolean> listRoom;

    public Manage(){
        listRoom = new HashMap<Integer, Boolean>();
        for(int i = 0; i < ROOM_OF_NUMBERS; i++ ){
            listRoom.put(i,false);
        }
    }

    public HashMap<Integer, Boolean> getListRoom() {
        return listRoom;
    }

    public void setListRoom(HashMap<Integer, Boolean> listRoom) {
        this.listRoom = listRoom;
    }

    public void addRoom(Room room) {
        this.listRoom.put(room.getRoomNumber(), true);
    }
}

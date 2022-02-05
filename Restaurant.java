import java.util.HashMap;

public class Restaurant {
    public static final int ROOM_OF_NUMBERS = 20;
    public HashMap<Integer, Boolean> listRoom;

    public Restaurant(){
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
}

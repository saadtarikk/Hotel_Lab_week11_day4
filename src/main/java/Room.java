import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> guestList;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guestList = new ArrayList<>();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(Guest guest) {
        this.guestList.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guestList.remove(guest);
    }

    public int getGuestListLength(){
        return this.guestList.size();
    }

}

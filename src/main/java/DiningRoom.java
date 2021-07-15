import java.util.ArrayList;

public class DiningRoom extends Room {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public DiningRoom(RoomType roomType, String name, int capacity) {
        super(roomType);
        this.guests = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }
}

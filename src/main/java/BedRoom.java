import java.util.ArrayList;

public class BedRoom extends Room {

    private int roomNumber;
    private int nightlyRate;

    public BedRoom(RoomType roomType, int roomNumber, int nightlyRate) {
        super(roomType);
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    public int getNightlyRate() {
        return nightlyRate;
    }
}

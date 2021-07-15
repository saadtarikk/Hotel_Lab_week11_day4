public class Booking {

    private BedRoom bedRoom;
    private int numOfNights;

    public Booking(BedRoom bedRoom, int numOfNights) {
        this.bedRoom = bedRoom;
        this.numOfNights = numOfNights;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public Booking bookRoom(BedRoom bedroom, int nights) {
        return new Booking(bedroom, nights);
    }

    public int getPrice() {
        return (bedRoom.getNightlyRate() * getNumOfNights());
    }
}

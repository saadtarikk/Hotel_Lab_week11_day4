import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<BedRoom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRoomHashMap;



    public Hotel() {
        this.bedRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRoomHashMap = new HashMap<>();
    }

    public ArrayList<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addBedRoom(BedRoom bedRoom) {
        bedRooms.add(bedRoom);
    }

    public int bedRoomCollectionSize() {
        return bedRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public int conferenceRoomCollectionSize() {
        return conferenceRooms.size();
    }

    public boolean findMyConferenceRoom(String name) {
        for (ConferenceRoom room : conferenceRooms) {
            if(room.getName().equals(name)){
                return true;
            }
        }
        return false;
    };


    public void addGuestToConferenceRoom(Guest guest, String search) {
        for (ConferenceRoom room : conferenceRooms) {
            if(room.getName().equals(search)){
                room.setGuestList(guest);
            }
        }
    }

    public void removeGuestFromConferenceRoom(Guest guest1, String search) {
        for (ConferenceRoom room : conferenceRooms) {
            if(room.getName().equals((search))){
                room.removeGuest(guest1);
            }
        }
    }

    public void addGuestToBedRoom(Guest guest, int search) {
        if(findVacantRoom() != null) {
            for (BedRoom room : bedRooms) {
                if (room.getRoomNumber() == search) {
                    room.setGuestList(guest);
                }
            }
        }
    }

    public void addDiningRoom(DiningRoom room) {
        diningRoomHashMap.put(room.getName(), room);
    }

    public int getAmountOfDingingRooms() {
        return diningRoomHashMap.size();
    }

    public BedRoom findVacantRoom() {
        BedRoom foundBedroom = null;
        for(BedRoom room : bedRooms){
            if(room.getGuestListLength() == 0){
                foundBedroom = room;
            }
        }
        return foundBedroom;
    }


//
//    public void addGuest(Guest guest) {
//        guests.add(guest);
//    }
}

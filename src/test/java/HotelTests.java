import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTests {

    private Hotel hotel;
    private BedRoom bedroom;
    private BedRoom bedroom2;
    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private Guest guest1;
    private Booking booking;
    private DiningRoom diningRoom1;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new BedRoom(RoomType.DOUBLE, 1, 60);
        bedroom2 = new BedRoom(RoomType.SINGLE, 2, 100);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Business");
        guest = new Guest("Michael");
        guest1 = new Guest("Saad");
        booking = new Booking(bedroom, 5);
        diningRoom1 = new DiningRoom(RoomType.DINING, "Porkys", 30);
    }

    @Test
    public void hotelHasACollectionOfBedrooms () {
        hotel.addBedRoom(bedroom);
        hotel.addBedRoom(bedroom2);
        assertEquals(2, hotel.bedRoomCollectionSize());
    }

    @Test
    public void hotelHasCollectionOfConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCollectionSize());
    }

    @Test
    public void canFindConferenceRoomByName() {
        hotel.addConferenceRoom(conferenceRoom);
        assertTrue(hotel.findMyConferenceRoom("Business"));
    };

    @Test
    public void canCheckInGuest() {
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addGuestToConferenceRoom(guest, "Business");
        hotel.addGuestToConferenceRoom(guest1, "Business");
        assertEquals(2, conferenceRoom.getGuestListLength());

    }
    @Test
    public void canCheckOutGuest() {
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addGuestToConferenceRoom(guest, "Business");
        hotel.addGuestToConferenceRoom(guest1, "Business");
        hotel.removeGuestFromConferenceRoom(guest1, "Business");
        assertEquals(1, conferenceRoom.getGuestListLength());
    }

    @Test
    public void canBookRoom() {
        booking.bookRoom(bedroom, 5);
        assertEquals(1, bedroom.getRoomNumber());
        assertEquals(5, booking.getNumOfNights());
    }

    @Test
    public void bedroomHasNightlyRate(){
        assertEquals(60, bedroom.getNightlyRate());
    }

    @Test
    public void  hasTotalBillForBooking() {
        booking.bookRoom(bedroom, 5);
        assertEquals(300, booking.getPrice());
    };

    @Test
    public void diningRoomHasName() {
        assertEquals("Porkys", diningRoom1.getName());

    }

    @Test
    public void hasHashMapOfDiningRoom() {
        hotel.addDiningRoom(diningRoom1);
        assertEquals(1, hotel.getAmountOfDingingRooms());
    }

    @Test
    public void canOnlyReturnVacantBedrooms() {
        hotel.addBedRoom(bedroom);
        hotel.addBedRoom(bedroom2);
        hotel.addGuestToBedRoom(guest, 2);
        assertEquals(bedroom, hotel.findVacantRoom());

    }




}

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    private ConferenceRoom conferenceRoom;
    private BedRoom bedRoom;

    @Before
    public void before() {
        bedRoom = new BedRoom(RoomType.SINGLE, 5, 60);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Business");
        }

        @Test
    public void hasRoomType() {
        assertEquals(RoomType.SINGLE, bedRoom.getRoomType());
        }

        @Test
    public void hasRoomNumber() {
        assertEquals(5, bedRoom.getRoomNumber());
        }

        @Test
    public void canHaveConferenceRoom() {
        assertEquals(RoomType.CONFERENCE, conferenceRoom.getRoomType());
        }

        @Test
    public void ConferenceRoomHasName() {
        assertEquals("Business", conferenceRoom.getName());
        }



}

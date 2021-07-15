import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before() {
        guest = new Guest("Michael");
    }

    @Test
    public void guestHasName() {
        assertEquals("Michael", guest.getName());
    }

    @Test
    public void canGetCapacityFromEnum() {
        assertEquals(2, RoomType.DOUBLE.getCapacity());
    }

}

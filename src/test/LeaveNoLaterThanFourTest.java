package test;

import main.DepartureTime;
import org.junit.Test;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.*;



class LeaveNoLaterThanFourTest {
    @Test
    void testLeaveNoLaterThanFour() throws ParseException {
        DepartureTime dt = new DepartureTime();

        assertNotEquals(dt.departureTimeCheck(dt.babySitterDepartureTime()), dt.beforeFour);
    }


}
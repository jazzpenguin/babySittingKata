package com.example;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;



class LeaveNoLaterThanFourTest {
    @Test
    void testLeaveNoLaterThanFour() throws ParseException {
        DepartureTime lt = new DepartureTime();

        lt.getDepartureTimeCheck();

        assertEquals(lt.getLeaveBeforeFour(), LocalTime.parse("02:00"));
        assertNotEquals(lt.getLeaveAfterFour(), lt.getNoLaterThanFourDeparture());
    }
}
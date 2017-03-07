package com.example;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;



class LeaveNoLaterThanFourTest {
    @Test
    void testLeaveNoLaterThanFour() throws ParseException {
        DepartureTime lt = new DepartureTime();
        lt.getBabySitterDepartureTime();
        lt.getDepartureTimeCheck();

        assertEquals(lt.getBabySitterDepartureTime(), LocalTime.parse("02:00"));
        assertNotEquals(lt.getBabySitterDepartureTime(), LocalTime.of(04,00));
    }
}
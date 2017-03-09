package com.example;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;



class LeaveNoLaterThanFourTest {
    @Test
    void testLeaveNoLaterThanFour() throws ParseException {
        DepartureTime lt = new DepartureTime();

        assertNotEquals(lt.departureTimeCheck(), LocalTime.of(03,59));
        assertNotEquals(lt.departureTimeCheck(), LocalTime.of(04,01));
    }
}
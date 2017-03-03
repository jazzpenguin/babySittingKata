package com.example;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;


class BeforeFiveCheckTest {

    @Test
    void testBeforeFiveCheck() throws ParseException {
        ArrivalTime ar = new ArrivalTime();

        ar.getArrivalTimeCheck();
        assertEquals(ar.getBabySitterArrivalAtFive(), LocalTime.parse("17:00"));
        assertNotEquals(ar.getBabysitterArrivalBeforeFive(), LocalTime.parse("17:00"));

    }
}
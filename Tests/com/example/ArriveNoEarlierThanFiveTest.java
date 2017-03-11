package com.example;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.time.LocalTime;

import static java.lang.System.in;
import static org.junit.jupiter.api.Assertions.*;


class ArriveNoEarlierThanFiveTest {

    @Test
    void testArriveNoEarlierThanFive() throws ParseException {
        ArrivalTime ar = new ArrivalTime();


        assertEquals(ar.arrivalTimeCheck(ArrivalTime.getBabySitterArrivalTimeBeforeFive()), ArrivalTime.notClockedIn);

    }
}
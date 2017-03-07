package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateHoursTest {

    @Test
    void testCalculateHoursArrivalToBedTime() {
        CalculateHours ch = new CalculateHours();

        ch.getFromArrivalToBedTime();

        assertEquals(ch.getFromArrivalToBedTime(), 3);

    }

    @Test
    void testCalculateHoursBedTimeToMidnight() {
        CalculateHours ch = new CalculateHours();

        ch.getFromBedTimeToMidnight();

        assertEquals(ch.getFromBedTimeToMidnight(), 4);

    }

    @Test
    void testCalculateMidnightToDepartureTime() {
        CalculateHours ch = new CalculateHours();

        ch.getFromMidnightToDepartureTime();

        assertEquals(ch.getFromMidnightToDepartureTime(), 3);

    }
}
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateHoursTest {

    @Test
    void testCalculateHoursArrivalToBedTime() {
        CalculateHours ch = new CalculateHours();

        assertEquals(ch.fromArrivalToBedTimeHours(), 3);
    }

    @Test
    void testCalculateHoursBedTimeToMidnight() {
        CalculateHours ch = new CalculateHours();

        assertEquals(ch.fromBedTimeToMidnightHours(), 4);
    }

    @Test
    void testCalculateMidnightToDepartureTime() {
        CalculateHours ch = new CalculateHours();

        assertEquals(ch.fromMidnightToDepartureTimeHours(), 3);
    }
}
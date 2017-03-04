package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateHoursTest {

    @Test
    void testCalculateHoursArrivalToBedTime() {
        CalculateHours ch = new CalculateHours();

        ch.fromArrivalToBedTime();

        assertEquals(ch.fromArrivalToBedTime(), 3);

    }

    @Test
    void testCalculateHoursBedTimeToMidnight() {
        CalculateHours ch = new CalculateHours();

        ch.fromBedTimeToMidnight();

        assertEquals(ch.fromBedTimeToMidnight(), 4);

    }

    @Test
    void testCalculateMidnightToDepartureTime() {
        CalculateHours ch = new CalculateHours();

        ch.fromMidnightToDepartureTime();

        assertEquals(ch.fromMidnightToDepartureTime(), 3);

    }
}
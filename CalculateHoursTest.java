package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateHoursTest {

    @Test
    void testCalculateHours() {
        CalculateHours ch = new CalculateHours();

        ch.fromArrivalToBedTime();

        assertEquals(ch.fromArrivalToBedTime(), 3);

    }
}
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatePayTest {

    @Test
    void testCalculatePayArrivalToBedTime() {
        CalculatePay cp = new CalculatePay();

        cp.getCalculatePayArrivalToBedTime();

        assertEquals(cp.getCalculatePayArrivalToBedTime(), 36);

    }

    @Test
    void testCalculatePayBedTimeToMidnight(){
        CalculatePay cp = new CalculatePay();

        cp.getCalculatePayBedTimeToMidnight();

        assertEquals(cp.getCalculatePayBedTimeToMidnight(), 32);


    }

    @Test
    void testCalculatePayMidnightToDepartureTime() {
        CalculatePay cp = new CalculatePay();

        cp.getCalculatePayMidnightToDepartureTime();
        assertEquals(cp.getCalculatePayMidnightToDepartureTime(), 32);

    }
}
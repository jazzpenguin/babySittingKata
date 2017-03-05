package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatePayTest {

    @Test
    void testCalculatePayArrivalToBedTime() {
        CalculatePay cp = new CalculatePay();

        cp.getCalculatePayArrivalToBedTime();

        assertEquals(cp.calculatePayArrivalToBedTime(), 36);

    }

    @Test
    void testCalculatePayBedTimeToMidnight(){
        CalculatePay cp = new CalculatePay();

        cp.getCalculatePayBedTimeToMidnight();

        assertEquals(cp.calculatePayBedTimeToMidnight(), 32);


    }

    @Test
    void testCalculatePayMidnightToDepartureTime() {
        CalculatePay cp = new CalculatePay();

        cp.calculatePayMidnightToDepartureTime();
        assertEquals(cp.calculatePayMidnightToDepartureTime(), 32);

    }
}
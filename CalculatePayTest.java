package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatePayTest {

    @Test
    void testCalculatePayArrivalToBedTime() {
        CalculatePay cp = new CalculatePay();

        cp.calculatePayArrivalToBedTime();

        assertEquals(cp.calculatePayArrivalToBedTime(), 36);

    }

    @Test
    void testCalculatePayBedTimeToMidnight(){
        CalculatePay cp = new CalculatePay();

        cp.calculatePayBedTimeToMidnight();

        assertEquals(cp.calculatePayBedTimeToMidnight(), 32);


    }
}
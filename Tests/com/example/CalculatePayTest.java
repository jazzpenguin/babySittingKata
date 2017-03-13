package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CalculatePayTest {

    @Test
    void testCalculatePayArrivalToBedTime() {
        CalculatePay cp = new CalculatePay();

        assertEquals(cp.calculatePayArrivalToBedTime(), 36);
    }

    @Test
    void testCalculatePayBedTimeToMidnight(){
        CalculatePay cp = new CalculatePay();

        assertEquals(cp.calculatePayBedTimeToMidnight(), 32);
    }

    @Test
    void testCalculatePayMidnightToDepartureTime() {
        CalculatePay cp = new CalculatePay();

        assertEquals(cp.calculatePayMidnightToDepartureTime(), 48);
    }
}
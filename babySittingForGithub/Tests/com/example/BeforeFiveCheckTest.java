package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BeforeFiveCheckTest {

    @Test
    void testBeforeFiveCheck() {
        ArrivalTime ar = new ArrivalTime();
        
        assertEquals(ar.getBabySitterArrivalAtFive(), "17:00");
        assertNotEquals(ar.getBabysitterArrivalBeforeFive(), "17:00");
    }
}
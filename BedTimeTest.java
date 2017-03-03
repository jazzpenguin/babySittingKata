package com.example;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class BedTimeTest {

    @Test
    void testBedTime() {

        BedTime bt = new BedTime();

        bt.askForBedTime();
        assertEquals(bt.askForBedTime(), LocalTime.parse("08:00"));

    }
}
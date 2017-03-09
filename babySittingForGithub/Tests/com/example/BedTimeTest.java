package com.example;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

class BedTimeTest {

    @Test
    void testBedTime() {

        BedTime bt = new BedTime();

        assertEquals(bt.getKidsBedTime(), LocalDateTime.of(2017, 01, 01, 20, 00));

    }
}
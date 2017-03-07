package com.example;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

class BedTimeTest {

    @Test
    void testBedTime() {

        BedTime bt = new BedTime();

        bt.getKidsBedTime();
        assertEquals(bt.getKidsBedTime(), LocalTime.parse("20:00"));

    }
}
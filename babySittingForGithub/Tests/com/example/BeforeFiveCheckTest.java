package com.example;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;


class BeforeFiveCheckTest {

    @Test
    void testBeforeFiveCheck() throws ParseException {
        ArrivalTime ar = new ArrivalTime();

        assertNotEquals(ar.arrivalTimeCheck(), LocalTime.of(17, 01));
        assertNotEquals(ar.arrivalTimeCheck(), LocalTime.of(16, 59));
    }
}
package test;

import main.CalculateHours;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculateHoursTest {
    // because the CalculateHours class uses ChronoUnit.HOURS, no fractional hours will be used in any calculations.

    @Test
    void testCalculateHoursArrivalToBedTime() {
        CalculateHours ch = new CalculateHours();

        assertEquals(ch.fromArrivalToBedTimeHours(), 3);
    }

    @Test
    void testCalculateHoursBedTimeToMidnight() {
        CalculateHours ch = new CalculateHours();

        assertEquals(ch.fromBedTimeToMidnightHours(), 4);
    }

    @Test
    void testCalculateMidnightToDepartureTime() {
        CalculateHours ch = new CalculateHours();

        assertEquals(ch.fromMidnightToDepartureTimeHours(), 3);
    }
}
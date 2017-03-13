package test;
import main.ArrivalTime;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.*;


class ArriveNoEarlierThanFiveTest {

    @Test
    void testArriveNoEarlierThanFive() throws ParseException {
        ArrivalTime ar = new ArrivalTime();

        assertEquals(ar.arrivalTimeCheck(ArrivalTime.getBabySitterArrivalTimeBeforeFive()), ArrivalTime.notClockedIn);
    }
}
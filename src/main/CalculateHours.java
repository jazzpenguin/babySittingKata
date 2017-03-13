package main;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class CalculateHours {
    ArrivalTime ar = new ArrivalTime();
    BedTime bt = new BedTime();
    DepartureTime dt = new DepartureTime();

    public long fromArrivalToBedTimeHours() {

        LocalTime arrival = ar.getBabySitterArrivalTimeBeforeFive();
        LocalDateTime bedTime = bt.getKidsBedTime();

        long totalArrivalToBedTime = ChronoUnit.HOURS.between(arrival, bedTime);

        return totalArrivalToBedTime;
    }

    LocalDateTime midnight = LocalDateTime.of(2017, 01, 02, 00, 00);

    public long fromBedTimeToMidnightHours() {
        LocalDateTime bedTime = bt.getKidsBedTime();
        LocalDateTime formattedBedTime = bedTime;

        long totalBedTimeToMidnight = ChronoUnit.HOURS.between(formattedBedTime, midnight);

        return totalBedTimeToMidnight;
    }

    public long fromMidnightToDepartureTimeHours() {

        LocalDateTime departureTime = dt.babySitterDepartureTime();
        if (departureTime.isAfter(LocalDateTime.of(2017, 01, 02,04, 00))) {
            departureTime = LocalDateTime.of(2017, 01, 02, 04, 00);
        }

        long totalMidnightToDeparture = ChronoUnit.HOURS.between(midnight, departureTime);

        return totalMidnightToDeparture;
    }
}

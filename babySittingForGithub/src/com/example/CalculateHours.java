package com.example;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class CalculateHours {


    public long fromArrivalToBedTimeHours() {
        ArrivalTime ar = new ArrivalTime();
        BedTime bt = new BedTime();
        LocalTime arrival = ar.getBabySitterArrivalTime();
        LocalDateTime bedTime = bt.getKidsBedTime();

        long totalArrivalToBedTime = ChronoUnit.HOURS.between(arrival, bedTime);

        return totalArrivalToBedTime;
    }

    LocalDateTime midnight = LocalDateTime.of(2017, 01, 02, 00, 00);

    public long fromBedTimeToMidnightHours() {
        BedTime bt = new BedTime();
        LocalDateTime bedTime = bt.getKidsBedTime();
        LocalDateTime formattedBedTime = bedTime;
        long totalBedTimeToMidnight = ChronoUnit.HOURS.between(formattedBedTime, midnight);
        return totalBedTimeToMidnight;
    }

    public long fromMidnightToDepartureTimeHours() {
        DepartureTime dt = new DepartureTime();
        LocalDateTime departureTime = dt.babySitterDepartureTime();
        if (departureTime.isAfter(LocalDateTime.of(2017, 01, 02,04, 00))) {
            departureTime = LocalDateTime.of(2017, 01, 02, 04, 00);

        }
        long totalMidnightToDeparture = ChronoUnit.HOURS.between(midnight, departureTime);
        return totalMidnightToDeparture;
    }
}

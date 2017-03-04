package com.example;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class CalculateHours {
    public long fromArrivalToBedTime() {
        ArrivalTime ar = new ArrivalTime();
        BedTime bt = new BedTime();
        LocalTime arrival = ar.getBabySitterArrivalTime();
        LocalTime bedTime = bt.getKidsBedTime();

        long total = ChronoUnit.HOURS.between(arrival, bedTime);

    return total;
    }

    public long fromBedTimeToMidnight() {
        BedTime bt = new BedTime();
        LocalDateTime midnight = LocalDateTime.of(0000, 01, 02, 00,00);
        LocalTime bedTime = bt.getKidsBedTime();
        LocalTime formattedBedTime = bedTime;
        long total = ChronoUnit.HOURS.between(formattedBedTime, midnight);
        return total;
    }

    public long fromMidnightToDepartureTime() {
        DepartureTime dt = new DepartureTime();
        LocalDateTime midnight = LocalDateTime.of(0000, 01, 02, 00,00);

        LocalDateTime departureTime = LocalDateTime.of(0000, 01, 02, 3, 00);
        long total = ChronoUnit.HOURS.between(midnight, departureTime);
        return total;
    }
}

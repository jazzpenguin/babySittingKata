package com.example;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class CalculateHours {
    public long getFromArrivalToBedTime(){
        return fromArrivalToBedTime();
    }

    public long getFromBedTimeToMidnight(){
        return fromBedTimeToMidnight();
    }

    public long getFromMidnightToDepartureTime(){
        return fromMidnightToDepartureTime();
    }

    long fromArrivalToBedTime() {
        ArrivalTime ar = new ArrivalTime();
        BedTime bt = new BedTime();
        LocalTime arrival = ar.getBabySitterArrivalTime();
        LocalTime bedTime = bt.getKidsBedTime();

        long total = ChronoUnit.HOURS.between(arrival, bedTime);

    return total;
    }

    private long fromBedTimeToMidnight() {
        BedTime bt = new BedTime();
        LocalDateTime midnight = LocalDateTime.of(0000, 01, 02, 00,00);
        LocalTime bedTime = bt.getKidsBedTime();
        LocalTime formattedBedTime = bedTime;
        long total = ChronoUnit.HOURS.between(formattedBedTime, midnight);
        return total;
    }

    private long fromMidnightToDepartureTime() {
        DepartureTime dt = new DepartureTime();
            LocalDateTime midnight = LocalDateTime.of(0000, 01, 02, 00,00);
            LocalTime departureTime = dt.getBabySitterDepartureTime();
                if (departureTime.isAfter(LocalTime.of(04,00))){
                    departureTime = LocalTime.of(04,00);
}
        long total = ChronoUnit.HOURS.between(midnight, departureTime);
        return total;
    }
}

package com.example;


import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CalculateHours {
    public long fromArrivalToBedTime() {
        ArrivalTime ar = new ArrivalTime();
        BedTime bt = new BedTime();
        LocalTime arrival = ar.getBabySitterArrivalAtFive();
        LocalTime bedTime = bt.getKidsBedTime();

        long total = ChronoUnit.HOURS.between(arrival, bedTime);

    return total;
    }
}

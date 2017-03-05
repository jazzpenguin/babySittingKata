package com.example;


public class CalculatePay {

    public long calculatePayArrivalToBedTime() {
        CalculateHours ch = new CalculateHours();

        int arrivalToBedTimeHourly = 12;

        long total = ch.fromArrivalToBedTime()*arrivalToBedTimeHourly;

    return total;
    }

    public long calculatePayBedTimeToMidnight() {
        CalculateHours ch = new CalculateHours();

        int bedTimeToMidnightHourly = 8;

        long total = bedTimeToMidnightHourly*ch.getFromBedTimeToMidnight();

        return total;
    }
}

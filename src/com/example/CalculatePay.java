package com.example;


public class CalculatePay {
    CalculateHours calculateHours = new CalculateHours();

    public long calculatePayArrivalToBedTime() {

        long arrivalToBedTimeHours = calculateHours.fromArrivalToBedTimeHours();
        int arrivalToBedTimeHourly = 12;

        long total = arrivalToBedTimeHours*arrivalToBedTimeHourly;

        return total;
    }

    public long calculatePayBedTimeToMidnight() {

        int bedTimeToMidnightHourly = 8;

        long total = bedTimeToMidnightHourly*calculateHours.fromBedTimeToMidnightHours();

        return total;
    }

    public long calculatePayMidnightToDepartureTime() {

        int midnightToDepartureTimeHourly = 16;

        long total =midnightToDepartureTimeHourly*calculateHours.fromMidnightToDepartureTimeHours();

        return total;
    }
}

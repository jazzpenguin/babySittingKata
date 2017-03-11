package com.example;


public class CalculatePay {


    public long calculatePayArrivalToBedTime() {
        CalculateHours calculateHours = new CalculateHours();
        long arrivalToBedTimeHours = calculateHours.fromArrivalToBedTimeHours();

        int arrivalToBedTimeHourly = 12;

        long total = arrivalToBedTimeHours*arrivalToBedTimeHourly;

        return total;
    }

    public long calculatePayBedTimeToMidnight() {
        CalculateHours calculateHours = new CalculateHours();

        int bedTimeToMidnightHourly = 8;

        long total = bedTimeToMidnightHourly*calculateHours.fromBedTimeToMidnightHours();

        return total;
    }

    public long calculatePayMidnightToDepartureTime() {
        CalculateHours calculateHours = new CalculateHours();

        int midnightToDepartureTimeHourly = 16;

        long total =midnightToDepartureTimeHourly*calculateHours.fromMidnightToDepartureTimeHours();


        return total;
    }
}

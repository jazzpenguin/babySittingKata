package com.example;


public class CalculatePay {

    public long getCalculatePayArrivalToBedTime(){
        return calculatePayArrivalToBedTime();
    }
    public long getCalculatePayBedTimeToMidnight(){
        return calculatePayBedTimeToMidnight();
    }
    public long getCalculatePayMidnightToDepartureTime(){
        return calculatePayMidnightToDepartureTime();
    }

    private long calculatePayArrivalToBedTime() {
        CalculateHours calculateHours = new CalculateHours();
        long arrivalToBedTimeHours = calculateHours.fromArrivalToBedTimeHours();
        int arrivalToBedTimeHourly = 12;

        long total = arrivalToBedTimeHours*arrivalToBedTimeHourly;

    return total;
    }

    private long calculatePayBedTimeToMidnight() {
        CalculateHours calculateHours = new CalculateHours();

        int bedTimeToMidnightHourly = 8;

        long total = bedTimeToMidnightHourly*calculateHours.fromBedTimeToMidnightHours();

        return total;
    }

    private long calculatePayMidnightToDepartureTime() {
        CalculateHours calculateHours = new CalculateHours();

        int midnightToDepartureTimeHourly = 16;

        long total =midnightToDepartureTimeHourly*calculateHours.fromMidnightToDepartureTimeHours();


        return total;
    }
}

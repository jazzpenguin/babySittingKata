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
        CalculateHours ch = new CalculateHours();

        int arrivalToBedTimeHourly = 12;

        long total = ch.fromArrivalToBedTime()*arrivalToBedTimeHourly;

    return total;
    }

    private long calculatePayBedTimeToMidnight() {
        CalculateHours ch = new CalculateHours();

        int bedTimeToMidnightHourly = 8;

        long total = bedTimeToMidnightHourly*ch.getFromBedTimeToMidnight();

        return total;
    }

    private long calculatePayMidnightToDepartureTime() {
        CalculatePay cp = new CalculatePay();

        int midnightToDepartureTimeHourly = 16;
        long midnightToDepartureHours = 2;

        long total = midnightToDepartureHours*midnightToDepartureTimeHourly;


        return total;
    }
}

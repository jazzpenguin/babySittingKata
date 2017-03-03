package com.example;

import java.text.ParseException;
import java.time.LocalTime;



public class DepartureTime {
    public LocalTime getLeaveBeforeFour() {
        return leaveBeforeFour;
    }

    public LocalTime getLeaveAfterFour() {
        return leaveAfterFour;
    }
    public LocalTime getNoLaterThanFourDeparture(){
            return noLaterThanFourDeparture;
    }
    public String getDepartureTimeCheck() throws ParseException {
        return departureTimeCheck();
    }

    LocalTime leaveBeforeFour = LocalTime.parse("04:00");
    LocalTime leaveAfterFour = LocalTime.parse("04:30");
    LocalTime noLaterThanFourDeparture = LocalTime.parse("04:00");

    private String departureTimeCheck() throws ParseException {

return null;
    }






}

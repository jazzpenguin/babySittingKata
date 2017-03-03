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

    LocalTime leaveBeforeFour = LocalTime.parse("02:00");
    LocalTime leaveAfterFour = LocalTime.parse("04:30");
    LocalTime noLaterThanFourDeparture = LocalTime.parse("04:00");

    private String departureTimeCheck() throws ParseException {
        if (getLeaveBeforeFour().isBefore(getNoLaterThanFourDeparture())){
            System.out.println("Have a nice night!");
        }
        else{
            System.out.println("It is after 04:00, your pay stopped at 04:00.");
        }

return null;
    }






}

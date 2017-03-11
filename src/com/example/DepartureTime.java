package com.example;
import sun.util.resources.cldr.ka.LocaleNames_ka;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;



public class DepartureTime {

    String beforeFour = "Have a nice night!";
    String afterFour= "It is after 04:00, your pay stopped at 04:00.";

    LocalDateTime noLaterThanFourDeparture = LocalDateTime.of(2017, 01, 02,04,00);

    public LocalDateTime babySitterDepartureTime(){
        LocalDateTime departureTime = LocalDateTime.of(2017, 01, 02, 03, 59);
        return departureTime;
    }

    public String departureTimeCheck(LocalDateTime time){
        String clockingOut = checkedOut(babySitterDepartureTime().isBefore(noLaterThanFourDeparture)) ? afterFour : beforeFour;
        return clockingOut;
    }
    private boolean checkedOut(boolean clockedOut){
        return clockedOut==clockedOut || "".equals(beforeFour);
    }

    }



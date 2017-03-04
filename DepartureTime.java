package com.example;

import java.text.ParseException;
import java.time.LocalTime;
import java.util.Scanner;


public class DepartureTime {
    Scanner in = new Scanner(System.in);

    public LocalTime getBabySitterDepartureTime() {
        return babySitterDepartureTime;
    }
        public LocalTime getNoLaterThanFourDeparture(){
            return noLaterThanFourDeparture;
    }
    public String getDepartureTimeCheck() throws ParseException {
        return departureTimeCheck();
    }

    LocalTime babySitterDepartureTime = LocalTime.parse(in.next());
    LocalTime noLaterThanFourDeparture = LocalTime.parse("04:00");

    private String departureTimeCheck() throws ParseException {
        if (getBabySitterDepartureTime().isBefore(getNoLaterThanFourDeparture())){
            System.out.println("Have a nice night!");
        }
        else{
            System.out.println("It is after 04:00, your pay stopped at 04:00.");
        }

return null;
    }






}

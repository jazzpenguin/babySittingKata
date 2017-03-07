package com.example;

import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class DepartureTime {

    Scanner in = new Scanner(System.in);

    public final LocalTime getBabySitterDepartureTime(){
        return babySitterDepartureTime;
    }

    public String getDepartureTimeCheck() throws ParseException {
        return departureTimeCheck();
    }

    private final LocalTime babySitterDepartureTime = LocalTime.parse(in.next());
    private LocalTime noLaterThanFourDeparture = LocalTime.of(04,00);

    String beforeFour = "Have a nice night!";
    String afterFour= "It is after 04:00, your pay stopped at 04:00.";
    private String departureTimeCheck() throws DateTimeParseException {


        if (babySitterDepartureTime.isBefore(noLaterThanFourDeparture)){
            System.out.println(beforeFour);
            return beforeFour;
        }
        else{
            System.out.println(afterFour);
            return afterFour;
        }
    }
}

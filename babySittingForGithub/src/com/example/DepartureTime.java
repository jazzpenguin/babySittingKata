package com.example;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class DepartureTime {

    Scanner in = new Scanner(System.in);


//       public final LocalTime babySitterDepartureTime = LocalTime.parse(in.next());

    LocalDateTime noLaterThanFourDeparture = LocalDateTime.of(2017, 01, 02,04,00);

    public LocalDateTime babySitterDepartureTime(){
        LocalDateTime departureTime = LocalDateTime.of(2017, 01, 02, 03, 59);
        return departureTime;
    }

    String beforeFour = "Have a nice night!";
    String afterFour= "It is after 04:00, your pay stopped at 04:00.";

    public String departureTimeCheck() throws DateTimeParseException {


        if (babySitterDepartureTime().isBefore(noLaterThanFourDeparture)){
            System.out.println(beforeFour);
            return beforeFour;
        }
        else{
            System.out.println(afterFour);
            return afterFour;
        }
    }
}

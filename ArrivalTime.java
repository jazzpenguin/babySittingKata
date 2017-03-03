package com.example;
import java.text.ParseException;
import java.time.LocalTime;

public class ArrivalTime {

    public LocalTime getBabySitterArrivalAtFive() {
        return babySitterArrivalAtFive;
    }

    public LocalTime getBabysitterArrivalBeforeFive() {
        return babysitterArrivalBeforeFive;
    }
    public String getArrivalTimeCheck() throws ParseException {
        return arrivalTimeCheck();
    }

    LocalTime babySitterArrivalAtFive = LocalTime.parse("17:00");
    LocalTime babysitterArrivalBeforeFive = LocalTime.parse("16:30");
    LocalTime requestedArrivalTime = LocalTime.parse("17:00");

    private String arrivalTimeCheck() throws ParseException {
        String clockedIn = "You are clocked in";
        String notClockedIn = "The current time is: " + getBabySitterArrivalAtFive() + " You need to wait until 17:00 to clock in.";
//checks to see if the babysitters clock in time is before 5:00 pm. if it isn't, the babysitter is clocked in. 
        if (babySitterArrivalAtFive.isBefore(requestedArrivalTime)) {
            System.out.println(notClockedIn);
            System.out.println("This program will close now. Run again at 17:00.");
            System.exit(0);
            return notClockedIn;
        } else {
            System.out.println(clockedIn);
            return clockedIn;
        }
    }
}

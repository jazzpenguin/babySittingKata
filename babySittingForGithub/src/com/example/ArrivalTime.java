package com.example;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.Scanner;

public class ArrivalTime {
    Scanner in = new Scanner(System.in);

//   public final LocalTime babySitterArrivalTime = LocalTime.parse(in.next());  user input
    public LocalTime getBabySitterArrivalTime(){
        LocalTime babySitterArrivalTime = LocalTime.of(16, 59);
        return babySitterArrivalTime;
    }

    LocalTime requestedArrivalTime = LocalTime.of(17, 00);

    public String arrivalTimeCheck() throws ParseException {
        String clockedIn = "You are clocked in";
        String notClockedIn = "The current time is: " + getBabySitterArrivalTime() + " You need to wait until 17:00 to clock in.";

//checks to see if the babysitters clock in time is before 5:00 pm. if it isn't, the babysitter is clocked in.
        if (getBabySitterArrivalTime().isBefore(requestedArrivalTime)) {
            System.out.println(notClockedIn);
            System.out.println("This program will close now. Run again at 17:00.");
//            System.exit(0);
            return notClockedIn;
        } else {
            return clockedIn;
        }
    }
}

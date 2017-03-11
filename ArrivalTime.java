package com.example;
import java.text.ParseException;
import java.time.LocalTime;


public class ArrivalTime {

    public static LocalTime getBabySitterArrivalTime(){
        LocalTime babySitterArrivalTime = LocalTime.of(16, 59);
        return babySitterArrivalTime;
    }

    public static LocalTime requestedArrivalTime = LocalTime.of(17, 00);
    public static final String clockedIn = "You are clocked in";
    public static final String notClockedIn = " You need to wait until 17:00 to clock in.";


    public static String arrivalTimeCheck(LocalTime time) {
        String clockingIn = checkedIn(getBabySitterArrivalTime().isBefore(requestedArrivalTime)) ? notClockedIn : clockedIn;

        return clockingIn;
    }
    private static boolean checkedIn(boolean time) {
        return time == time || "".equals(clockedIn);
        }
    }





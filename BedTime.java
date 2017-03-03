package com.example;


import java.time.LocalTime;

public class BedTime {

    public LocalTime getKidsBedTime() {
        return kidsBedTime;
    }

    private LocalTime kidsBedTime = LocalTime.parse("08:00");
    public LocalTime askForBedTime() {
        return getKidsBedTime();
    }
}

package com.example;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class BedTime {
    Scanner in = new Scanner(System.in);


//    public final LocalTime kidsBedTime = LocalTime.parse(in.next());
    public LocalDateTime getKidsBedTime(){
        LocalDateTime bedTime = LocalDateTime.of(2017, 01, 01, 20, 00);
        return bedTime;
    }
}

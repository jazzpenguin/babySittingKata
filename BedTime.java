package com.example;


import java.time.LocalTime;
import java.util.Scanner;

public class BedTime {
    Scanner in = new Scanner(System.in);

    public LocalTime getKidsBedTime() {
        return kidsBedTime;
    }

    private LocalTime kidsBedTime = LocalTime.parse(in.next());
}

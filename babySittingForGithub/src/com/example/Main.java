package com.example;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        //start of program

        System.out.println("Enter the time you arrived to babysit: (24:00)");
        ArrivalTime ar = new ArrivalTime();
        ar.getBabySitterArrivalTime();
            try {
            ar.getArrivalTimeCheck();
            } catch (ParseException e){
                e.printStackTrace();
                System.out.println("There was a problem with the time you entered. " +
                    "If the time you entered is before 12:00, be sure to include a 0 before the number.");
        }

        System.out.println("Enter the bedtime for the kids: (24:00)");
        BedTime bt = new BedTime();
            bt.getKidsBedTime();

        System.out.println("Enter the time that you left: (24:00)");
        DepartureTime dt = new DepartureTime();
        dt.getBabySitterDepartureTime();
            try{
                dt.getDepartureTimeCheck();
            }catch(ParseException e){
                e.printStackTrace();
                System.out.println("There was a problem with the time you entered. " +
                        "If the time you entered is before 12:00, be sure to include a 0 before the number.");
            }
//calculating total pay
        CalculatePay cp = new CalculatePay();
        System.out.println("Your total pay for the night is: $" +
                (cp.getCalculatePayArrivalToBedTime()+cp.getCalculatePayBedTimeToMidnight()+cp.getCalculatePayMidnightToDepartureTime()));

    }
}

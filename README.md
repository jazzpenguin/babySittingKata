# babySittingKata
A project for an application to the Pillar Technologies apprenticeship program. 

Summary:
  This project takes input from the user, who is a babysitter that will be wanting to calculate one nights worth of pay. In this situation you cannot clock in before 5 PM and you cannot clock out after 4 AM. 

# Requirements
The babysitter should arrive no earlier than 5:00 PM
The babysitter should leave no later than 4:00 AM
The babysitter gets paid $12/hr from their arrival time until the kids' bed time
The babysitter gets paid $8/hr from bed time to midnight
The babysitter gets paid $16/hr from midnight to the time that they leave
The babysitter gets paid in full hours(no fractional hours)

# Assembly 
Clone the repo in a .Zip file
open .Zip and navigate through the SRC folder to the .Java files
To open the tests, open the .Zip and navigate through the Tests folder
open files in Intellij!

# Tests
Babysitter should arrive no earlier than 5:00 PM
I solved this problem by coding an if statement that tests the time the babysitter arrived against the requested arrival time. 
If the time is before 5:00 pm, the program tells the babysitter he/she needs to wait until 5:00 PM to check in. 
code example:

String clockingIn = checkedIn(getBabySitterArrivalTimeBeforeFive().isBefore(requestedArrivalTime)) ? notClockedIn : clockedIn;

Babysitter should leave no later than 4:00 AM
I solved this in a similar way to solving the arrival time. Instead of checking for 5:00 PM, it checks for 4:00 AM. 

Payment
I solved this by creating a class that calculates the hours worked for each of the segments of different pay. Arrival time to bed Time, bed time to midnight, and midnight to departure time. In this class if the departure time is after 4:00 AM, the program sets the departure time to equal 4:00 AM so that payment is properly calculated. To go along with the hour calculater, I created a payment calculator that takes the calculations from the hour calculator and multiplies them by the appropriate amount. 
Code example:

long arrivalToBedTimeHours = calculateHours.fromArrivalToBedTimeHours();
        int arrivalToBedTimeHourly = 12;

        long total = arrivalToBedTimeHours*arrivalToBedTimeHourly;
        
Code example#2:

LocalTime arrival = ar.getBabySitterArrivalTimeBeforeFive();
LocalDateTime bedTime = bt.getKidsBedTime();

long totalArrivalToBedTime = ChronoUnit.HOURS.between(arrival, bedTime);

Because I coded the program using ChronoUnit.Hours, no fractional hours will be used which solves the last problem. 

/*
 * This program will allow a traveler the ability to plan for the cost of a
 * trip.
 */

/**
 * @author Michael McIntyre
 * @Java Assn2, version 1.0
 */

//this is needed to read input from the keyboard

import java.util.Scanner;

public class McIntyreTripCalculator {

    public static void main(String[] args) {

        //Display  message to user explaining what program will do
        System.out.println("This program will calculate a trip report for the amount and time to destination.");

        //create an instance of the scanner and call it keyboard
        Scanner keyboard = new Scanner(System.in);

        //variable created to hold how big the gas tank is
        double tankCapacity = 22.0;

        //variable to hold the average miles per gallon the auto gets
        double averageMPG = 20.0;

        //variable to hold the total distance of the trip
        int tripDistance = 1000;

        //Define the rest of the variables needed for the program as floating point double values.

        //we are given how much gas will cost, declare a variable
        //and set it eqaul to $1.99
        final double GAS_COST = 1.99;

        //miles traveled
        final double MPH = 50.5;


        //Prompt user for input values including units

        //Store car tank capacity as double
        System.out.println("Please enter the car's tank capacity");
        tankCapacity = keyboard.nextDouble();

        //Store car's average mpg as double
        System.out.println("Enter the average MPG of the car");
        averageMPG = keyboard.nextDouble();

        //Store distance to destination in miles as int
        System.out.println("Enter the distance of the trip in miles");
        tripDistance = keyboard.nextInt();


        //Calculate and store the gallons of gas needed for the trip and the total cost for the gas.
        double fullTankCost = GAS_COST * (tankCapacity - 2);
        //System.out.printf("Full tank cost: %f\n", fullTankCost);


        //Calculate and store the distance the driver can travel before needing to stop for gas.
        double maxDistance = averageMPG * (tankCapacity - 2);
        //System.out.printf("Maximum distance: %f\n", maxDistance);

        //Calculate and store the number of stops that will be required for the entire trip.
        double amountOfStops = tripDistance / maxDistance;
        //System.out.printf("Amount of Stops: %f\n", amountOfStops);
        double totalTripCost = amountOfStops * fullTankCost;

        // Drive time
        double driveTime = tripDistance / MPH;
        System.out.printf("Drive Time: %f\n", driveTime);

        // Break time
        double breakTime = amountOfStops * 18;
        //System.out.printf("Break Time: %f\n", breakTime);

        // Total = (Drive time) + (Break time)
        double totalMinutes = (driveTime * 60) + breakTime;


        //Calculate and store the total time needed for the entire trip (including drive time and time
        //for stops).
        double totalHours = driveTime + (breakTime / 60);


        //Display several blank lines after reading the inputs, before displaying the results.
        System.out.printf("\n\n\n");
        System.out.println("Trip Calcualtor report");
        System.out.printf("\n");
        System.out.println("For a car trip with");
        System.out.printf("     Car's tank capacity of          %.1f gallons\n", tankCapacity);
        System.out.printf("     Car's average mileage of        %.1f miles per gallon\n", averageMPG);
        System.out.printf("     Distance to the destination     %d miles\n", tripDistance);
        System.out.printf("\n");
        System.out.printf("Gas cost for the trip:               $ %.1f\n", totalTripCost);
        System.out.printf("Time needed for the trip:            $ %.1f hours\n", totalHours);
        //System.out.printf("Time needed for the trip:            $ %.1f minutes\n", totalMinutes);
        System.out.printf("\n");
    }

}
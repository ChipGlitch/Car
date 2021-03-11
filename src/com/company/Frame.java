package com.company;

import javax.swing.*;

public class Frame {

    public static void main(String[] args)
    {
        // Creates a Car object and assigns its
        // address to the mazda variable.


        Car mazda = new Car();
        Car lamborghini = new Car();
        Car tesla = new Car();


        // Status update
        System.out.println("Car Testing: \n");

        // Call mazda object's setMake method.
        mazda.setMake("Mazda");
        tesla.setMake("Tesla");
        lamborghini.setMake("Lamborghini");


        // Call the mazda object's setWidth method.
        mazda.setYearModel(2014);
        tesla.setYearModel(2021);
        lamborghini.setYearModel(2007);

        System.out.println("Make: " + mazda.getMake());
        System.out.println("Year: " + mazda.getYearModel());
        System.out.println("The current speed is " + mazda.getSpeed() + " MPH\n");

        JOptionPane.showMessageDialog(null,
                "Make: " + mazda.getMake() + "\n" +
                        "Year: " + mazda.getYearModel() + "\n" +
                        "Speed: " + mazda.getSpeed() + " MPH");

        System.out.println("The " + mazda.getMake() + " is going " + mazda.accelerate() + " MPH."); // Rolls up to starting point.

        System.out.println("The " + mazda.getMake() + " is going " + mazda.getBrake() + " MPH.\n"); // Starting line.

        int i;

        for (i = 0; i < 35; i++)
        {
            System.out.println("The " + mazda.getMake() + " is going " + mazda.accelerate() + " MPH.");
        }

        for (i = 0; i < 35; i++)
        {
            System.out.println("The " + mazda.getMake() + " is going " + mazda.getBrake() + " MPH.");
        }

        // Initiate cruise control sequence.
        JOptionPane.showMessageDialog(null,mazda.getMake() + " cruise control test: " + mazda.cruiseControl() + " MPH sustained.\n");

        // Tesla Trial:
        System.out.println("Make: " + tesla.getMake());
        System.out.println("Year: " + tesla.getYearModel());
        System.out.println("The current speed is " + tesla.getSpeed() + " MPH\n");

        JOptionPane.showMessageDialog(null,
                "Make: " + tesla.getMake() + "\n" +
                        "Year: " + tesla.getYearModel() + "\n" +
                        "Speed: " + tesla.getSpeed() + " MPH");

        System.out.println("The " + tesla.getMake() + " is going " + tesla.accelerate() + " MPH."); // Rolls up to starting point.
        System.out.println("The " + tesla.getMake() + " is going " + tesla.getBrake() + " MPH.\n"); // Starting line.

        for (i = 0; i < 60; i++)
        {
            System.out.println("The " + tesla.getMake() + " is going " + tesla.accelerate() + " MPH.");
        }

        for (i = 0; i < 60; i++)
        {
            System.out.println("The " + tesla.getMake() + " is going " + tesla.getBrake() + " MPH.");
        }

        // Initiate cruise control sequence.
        JOptionPane.showMessageDialog(null,tesla.getMake()+ " cruise control test: " + tesla.cruiseControl() + " MPH sustained.\n");

        // Lamborghini trial:

        System.out.println("Make: " + lamborghini.getMake());
        System.out.println("Year: " + lamborghini.getYearModel());
        System.out.println("The current speed is " + lamborghini.getSpeed() + " MPH\n");

        JOptionPane.showMessageDialog(null,
                "Make: " + lamborghini.getMake() + "\n" +
                "Year: " + lamborghini.getYearModel() + "\n" +
                "Speed: " + lamborghini.getSpeed() + " MPH");

        System.out.println("The " + lamborghini.getMake() + " is going " + lamborghini.accelerate() + " MPH."); // Rolls up to starting point.
        System.out.println("The " + lamborghini.getMake() + " is going " + lamborghini.getBrake() + " MPH.\n"); // Starting line.


        for (i = 0; i < 50; i++)
        {
            System.out.println("The " + lamborghini.getMake() + " is going " + lamborghini.accelerate() + " MPH.");
        }

        for (i = 0; i < 35; i++)
        {
            System.out.println("The " + lamborghini.getMake() + " is going " + lamborghini.getBrake() + " MPH.");
        }

        // Initiate cruise control sequence.
        JOptionPane.showMessageDialog(null,lamborghini.getMake() + " cruise control test: " + lamborghini.cruiseControl() + " MPH sustained.");














    }
}

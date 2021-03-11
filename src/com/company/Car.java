package com.company;

public class Car
{
    private String make;
    private double yearModel;
    private double speed;


    /**
     * The setLength method stores a value in the length field.
     * @param carMake The value to store in length.
     */

    public void setMake(String carMake)
    {
        make = carMake;
    }

    /**
     * The setWidth method stores a value in the width field.
     * @param modelYear the The value to store in width.
     */

    public void setYearModel(double modelYear)
    {
        yearModel = modelYear;
    }

    public void setSpeed(double carSpeed)
    {
        speed = carSpeed;
    }


    /**
     * The getLength method returns a Car's objects length
     * @return The value in the length field.
     */

    public String getMake()
    {
        return make;
    }

    /**
     * The getWidth method returns a Car's objects width
     * @return The value in the width field.
     */

    public double getYearModel()
    {
        return yearModel;
    }

    public double getSpeed()
    {
        return speed;
    }


    public double accelerate() {
        speed = speed + 5;

        return speed;


    }

    public double cruiseControl() {
        while (speed < 25) {
            speed = speed + 5;
            System.out.println(speed);
        }
        while (speed != 25) {
            speed = speed - 5;
            System.out.println(speed);
        }
        return speed;

    }

    public double getBrake() {
        speed = speed - 5;

        return speed;

    }
}

//
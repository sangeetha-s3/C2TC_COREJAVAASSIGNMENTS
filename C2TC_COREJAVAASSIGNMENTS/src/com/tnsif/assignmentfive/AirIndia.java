package com.tnsif.assignmentfive;

public class AirIndia implements Airfare {
    private int hours;
    private double costPerHour;

    // Default constructor
    public AirIndia() {}

    // Parameterized constructor
    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Implemented methods
    @Override
    public double calculateAmount() {
        return hours * costPerHour;
    }

    @Override
    public void display() {
        System.out.printf("%.2f%n", calculateAmount());
    }
}

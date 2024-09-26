package com.mycompany.agency;
// Created by: Moeez R. Zahid

public class TempEmploee extends StaffEmployee {
    private int hoursWorked;

    // Constructor
    public TempEmploee(String eName, String eAddress, String ePhone,
                       String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    // Adds the specified number of hours to this employee's accumulated hours
    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    // Computes and returns the pay for this hourly employee
    @Override
    public double pay() {
        return hoursWorked * getPayRate();
    }

    // Returns information about this hourly employee as a string
    @Override
    public String toString() {
        return "Employee - \n" +
                "Name: " + getName() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Phone: " + getPhone() + "\n" +
                "Social Security Number: " + getSocialSecurityNumber() + "\n" +
                "Current hours: " + hoursWorked + "\n" +
                "Paid: " + String.format("%.2f", pay()) + "\n" +
                "----------------------------------------";
    }
}

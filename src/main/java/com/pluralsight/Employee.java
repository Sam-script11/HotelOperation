package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Employee {
    private double employeeID,payRate,hourseWorked,totalPay,regularHours,overTimeHours;
    private String name,department;

    public Employee(double employeeID, double payRate, double hourseWorked, String name, String department) {
        this.employeeID = employeeID;
        this.payRate = payRate;
        this.hourseWorked = hourseWorked;
        this.name = name;
        this.department = department;
    }

    public double getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(double employeeID) {
        this.employeeID = employeeID;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHourseWorked() {
        return hourseWorked;
    }

    public void setHourseWorked(double hourseWorked) {
        this.hourseWorked = hourseWorked;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getTotalPay(){
        return hourseWorked * payRate;
    }
    public double getRegularHours(){
        return hourseWorked;
    }
    public double getOverTimeHours(){
        return (totalPay *1.5)*overTimeHours;
    }

    public void punchTimeCard(double punchIN, double punchOut){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm a"); // formatting hours and minutes and PM or AM, (a is what creates AM or PM)
        LocalTime punchInTime = LocalTime.now();
        LocalTime punchOutTime = LocalTime.now();


        System.out.print( "Punch in: "+punchInTime.format(formatter) + " \n Punch Out: " + punchOutTime.format(formatter));

    }

}

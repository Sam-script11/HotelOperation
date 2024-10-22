package com.pluralsight;

public class Room{
    private int numberOfBeds;
    private double price;
    boolean isOccupied,isDirty,isAvailable;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public static boolean checkIn(String dirty){


        return true;
    }
    public static boolean checkOut(String clean){
       return true;
    }
    public static void cleanRoom(){
        if (checkIn("Dirty")){
            System.out.println("occupied");

        } else{
            checkOut("Needs to be cleaned");
        }

    }
}

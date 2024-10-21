package com.pluralsight;

public class Reservation {
     private String roomType;
        private double price, ReservationTotal;
        private int numberOfNights;
        private boolean isWeekend;

        public Reservation(String roomType, double price, double reservationTotal, int numberOfNights, boolean isWeekend) {
            this.roomType = roomType;
            this.price = price;
            ReservationTotal = reservationTotal;
            this.numberOfNights = numberOfNights;
            this.isWeekend = isWeekend;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            if (roomType.equalsIgnoreCase("king")) {
                price = 139;
            } else if (roomType.equalsIgnoreCase("Double")) {
                price = 124;

            } else {
                this.roomType = roomType;
            }
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getReservationTotal() {
            if(isWeekend){
                return price *.1;
            }
            return ReservationTotal;
        }

        public void setReservationTotal(double reservationTotal) {
            ReservationTotal = reservationTotal;
        }

        public int getNumberOfNights() {
            return numberOfNights;
        }

        public void setNumberOfNights(int numberOfNights) {
            this.numberOfNights = numberOfNights;
        }

        public boolean isWeekend() {
            return isWeekend;
        }

        public void setWeekend(boolean weekend) {
            isWeekend = weekend;
        }

    }


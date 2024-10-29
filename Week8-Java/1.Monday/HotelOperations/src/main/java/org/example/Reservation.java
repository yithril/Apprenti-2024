package org.example;

public class Reservation {
    private RoomType roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(RoomType roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
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

    public double getReservationTotal(){
        double price = 0;
        if(this.roomType == RoomType.KING){
            price = 139;
        }
        else{
            price = 124;
        }

        double reservationTotal = price * numberOfNights;

        if(isWeekend){
            reservationTotal *= 1.1;
        }

        return reservationTotal;
    }
}

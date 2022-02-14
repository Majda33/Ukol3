package com.engeto.Ukol3;

public class Hotel {
    private int roomNumber;
    private int bedsInRoom;
    private boolean balcony;
    private int pricePerRoom;
    private boolean viewOfTheSea;

    public Hotel(int roomNumber, int bedsInRoom, boolean balcony, int pricePerRoom, boolean viewOfTheSea) {
        this.roomNumber = roomNumber;
        this.bedsInRoom = bedsInRoom;
        this.balcony = balcony;
        this.pricePerRoom = pricePerRoom;
        this.viewOfTheSea = viewOfTheSea;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedsInRoom() {
        return bedsInRoom;
    }

    public void setBedsInRoom(int bedsInRoom) {
        this.bedsInRoom = bedsInRoom;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public int getPricePerRoom() {
        return pricePerRoom;
    }

    public void setPricePerRoom(int pricePerRoom) {
        this.pricePerRoom = pricePerRoom;
    }

    public boolean isViewOfTheSea() {
        return viewOfTheSea;
    }

    public void setViewOfTheSea(boolean viewOfTheSea) {
        this.viewOfTheSea = viewOfTheSea;
    }

    public String getDescription() {
        return "Pokoj č. "+ roomNumber+": "+ bedsInRoom +" míst, "+  pricePerRoom +" Kč/noc";
    }

}

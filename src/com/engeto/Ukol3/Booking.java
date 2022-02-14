package com.engeto.Ukol3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    HotelGuest mainGuest;
    List <HotelGuest> guestInRoom;
    TypeOfStay typeOfstay;
    LocalDate startDate;
    LocalDate endDate;
    Hotel room;


    public Booking(HotelGuest mainGuest, TypeOfStay typeOfstay, LocalDate startDate, LocalDate endDate, Hotel room) {
        this.mainGuest = mainGuest;
        this.typeOfstay = typeOfstay;
        this.startDate = startDate;
        this.endDate = endDate;
        this.room = room;
        this.guestInRoom = new ArrayList<>();
        this.guestInRoom.add(mainGuest);
    }



    public HotelGuest getMainGuest() {
        return mainGuest;
    }

    public void addHotelGuest(HotelGuest newGuest) {
        guestInRoom.add(newGuest);
    }
    public void removeHotelGuest(HotelGuest guest) {
        guestInRoom.remove(guest);
    }
    public void clearOtherGuests() {
        guestInRoom.clear();
    }

    public void setMainGuest(HotelGuest mainGuest) {
        this.mainGuest = mainGuest;
    }

    public List<HotelGuest> getGuestInRoom() {
        return guestInRoom;
    }

    public void setGuestInRoom(List<HotelGuest> guestInRoom) {
        this.guestInRoom = guestInRoom;
    }

    public TypeOfStay getTypeOfstay() {
        return typeOfstay;
    }

    public void setTypeOfstay(TypeOfStay typeOfstay) {
        this.typeOfstay = typeOfstay;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Hotel getRoom() {
        return room;
    }

    public void setRoom(Hotel room) {
        this.room = room;
    }

    public String getDescription() {
        StringBuilder result = new StringBuilder("Booking for "+mainGuest.getFullName()+" ("+typeOfstay+")"
                +" room  number "+room.getRoomNumber()+ " from " + startDate.toString() + " to " + endDate.toString() + " List of guests in room: ");
        for (HotelGuest guest : guestInRoom) {
            result.append(guest.getFullName()).append(", ");
        }
        return result.toString();
    }
}

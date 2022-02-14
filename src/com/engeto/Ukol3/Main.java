package com.engeto.Ukol3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        HotelGuest adela = new HotelGuest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        HotelGuest jan = new HotelGuest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        System.out.println(adela.getDescription() + " " + jan.getDescription());

        Hotel room1 = new Hotel(1, 1, true, 1000, true);
        System.out.println(room1.getDescription());
        Hotel room2 = new Hotel(2, 1, true, 1000, true);
        System.out.println(room2.getDescription());
        Hotel room3 = new Hotel(3, 3, false, 2400, true);
        System.out.println(room3.getDescription());

        Booking booking1 = new Booking(adela, TypeOfStay.WORKING, LocalDate.of(2021,7,19),LocalDate.of(2021,07,26),room1);
        Bookings bookings = new Bookings();
        bookings.addBooking(booking1);

        Booking booking2 = new Booking(adela,TypeOfStay.PRIVATE, LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),room3 );
        booking2.addHotelGuest(jan);
        bookings.addBooking(booking2);

        bookings.printBookings();
    }
}
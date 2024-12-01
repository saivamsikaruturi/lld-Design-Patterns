package com.example.designpatterns.structural.facade.BookMyShow;

import java.util.HashSet;
import java.util.Set;

class SeatService {
    private Set<String> reservedSeats;

    public SeatService() {
        reservedSeats = new HashSet<>();
    }

    public boolean chooseSeat(String seatNumber) {
        if (reservedSeats.contains(seatNumber)) {
            System.out.println("Seat '" + seatNumber + "' is already reserved. Please choose another seat.");
            return false;
        } else {
            reservedSeats.add(seatNumber);
            System.out.println("Seat '" + seatNumber + "' has been successfully reserved.");
            return true;
        }
    }
}

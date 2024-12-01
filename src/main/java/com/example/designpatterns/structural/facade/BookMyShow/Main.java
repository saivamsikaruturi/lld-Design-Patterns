package com.example.designpatterns.structural.facade.BookMyShow;

public class Main {
    public static void main(String[] args) {
        TicketBookingFacade ticketBooking = new TicketBookingFacade();

        // Booking Example 1
        ticketBooking.bookTicket(
                "Inception",
                "7:00 PM",
                "A12",
                "Credit Card",
                15.50
        );

        // Booking Example 2 (Failure due to reserved seat)
        ticketBooking.bookTicket(
                "Inception",
                "7:00 PM",
                "A12",
                "PayPal",
                15.50
        );

        // Booking Example 3 (Failure due to unavailable movie)
        ticketBooking.bookTicket(
                "Avatar",
                "7:00 PM",
                "B10",
                "Debit Card",
                12.50
        );
    }
}

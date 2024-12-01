package com.example.designpatterns.structural.facade.BookMyShow;

class TicketService {
    public void generateTicket(String movieName, String time, String seatNumber) {
        System.out.println("\n=== Ticket Details ===");
        System.out.println("Movie: " + movieName);
        System.out.println("Show Time: " + time);
        System.out.println("Seat: " + seatNumber);
        System.out.println("======================");
        System.out.println("Enjoy your movie!");
    }
}

package com.example.designpatterns.structural.facade.BookMyShow;

class TicketBookingFacade {
    private MovieService movieService;
    private SeatService seatService;
    private PaymentService paymentService;
    private TicketService ticketService;

    public TicketBookingFacade() {
        this.movieService = new MovieService();
        this.seatService = new SeatService();
        this.paymentService = new PaymentService();
        this.ticketService = new TicketService();
    }

    public void bookTicket(String movieName, String showTime, String seatNumber, String paymentMethod, double amount) {
        System.out.println("\n--- Movie Ticket Booking Process Started ---");

        // Step 1: Select Movie
        if (!movieService.selectMovie(movieName)) {
            System.out.println("Booking failed: Movie not available.");
            return;
        }

        // Step 2: Select Show Time
        if (!movieService.selectShowTime(movieName, showTime)) {
            System.out.println("Booking failed: Show time not available.");
            return;
        }

        // Step 3: Choose Seat
        if (!seatService.chooseSeat(seatNumber)) {
            System.out.println("Booking failed: Seat is already reserved.");
            return;
        }

        // Step 4: Process Payment
        if (!paymentService.processPayment(paymentMethod, amount)) {
            System.out.println("Booking failed: Payment could not be processed.");
            return;
        }

        // Step 5: Generate Ticket
        ticketService.generateTicket(movieName, showTime, seatNumber);

        System.out.println("--- Movie Ticket Booking Process Completed ---");
    }
}

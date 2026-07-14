class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Setters
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    // Getters & Logic
    public String getMovieName() {
        return movieName;
    }
    public double getTicketPrice() {
        return ticketPrice;
    }
    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public double getTotalCost() {
        double total = ticketPrice * numberOfTickets;
        if (numberOfTickets >= 5) {
            total -= total * 0.05; // 5% discount
        }
        return total;
    }
}

public class  MovieTicketBooking {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.setMovieName("Inception");
        ticket.setTicketPrice(250);
        ticket.setNumberOfTickets(6);

        System.out.println("Movie Name: " + ticket.getMovieName());
        System.out.println("Total Price: ₹" + ticket.getTotalCost());
    }
}
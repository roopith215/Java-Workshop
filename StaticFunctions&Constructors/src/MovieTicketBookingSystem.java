class MovieTicket {
    String movieName;
    String seatNumber;

    // Instance Initializer Block
    {
        System.out.println("Booking Started");
    }

    // Default constructor
    public MovieTicket() {
        this("Regular Movie", "General");
    }

    // Overloaded constructor with movie name
    public MovieTicket(String movieName) {
        this(movieName, "A12"); // Matching output example seat
    }

    // Overloaded constructor with movie name and seat number
    public MovieTicket(String movieName, String seatNumber) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        System.out.println("Movie: " + this.movieName);
        System.out.println("Seat No: " + this.seatNumber);
    }

    public static void main(String[] args) {
        new MovieTicket("Avengers");
    }
}
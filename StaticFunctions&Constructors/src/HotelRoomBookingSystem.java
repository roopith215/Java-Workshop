class HotelBooking {
    String roomType;
    String customerName;

    // Instance Initializer Block
    {
        this.roomType = "Deluxe";
        System.out.println("Booking Initialized");
    }

    // Default constructor
    public HotelBooking() {
        this("Guest");
    }

    // Constructor with customer name
    public HotelBooking(String customerName) {
        this.customerName = customerName;
        System.out.println("Customer: " + this.customerName);
        System.out.println("Room Type: " + this.roomType);
    }

    // Constructor with customer name and room type
    public HotelBooking(String customerName, String roomType) {
        this.customerName = customerName;
        this.roomType = roomType;
        System.out.println("Customer: " + this.customerName);
        System.out.println("Room Type: " + this.roomType);
    }

    public static void main(String[] args) {
        new HotelBooking("Aman");
    }
}
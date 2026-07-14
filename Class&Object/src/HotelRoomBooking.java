class HotelBooking {
    private String guestName;
    private double roomPricePerNight;
    private int numberOfNights;

    // Setters
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
    public void setRoomPricePerNight(double roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    // Getters & Logic
    public double getFinalAmount() {
        double total = roomPricePerNight * numberOfNights;
        if (numberOfNights >= 7) {
            total -= total * 0.15; // 15% discount
        }
        return total;
    }
}

public class HotelRoomBooking {
    public static void main(String[] args) {
        HotelBooking booking = new HotelBooking();
        booking.setGuestName("Vikram Singh");
        booking.setRoomPricePerNight(2000);
        booking.setNumberOfNights(8);

        System.out.println("Display Final Amount: ₹" + booking.getFinalAmount());
    }
}
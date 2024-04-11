public class Room {
    BookingInfo bookings;
    int roomNumber;

    public Room(int roomNumber) {
        this.bookings = new BookingInfo();
        this.roomNumber = roomNumber;
    }
}

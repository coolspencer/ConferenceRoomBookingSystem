import java.util.*;

public class BookingInfo {
    List<Duration> bookingInfo = new ArrayList<>();

    boolean isAvailableMeetingRoom(Duration duration) {
        Collections.sort(bookingInfo,
                (a, b) -> a.bookingdate == b.bookingdate ? a.startTime.compareTo(b.startTime)
                        : a.bookingdate - b.bookingdate);
        System.out.println("***  booking Info ***");
        for (Duration temp : bookingInfo) {

            System.out.println("Booking Date " + temp.bookingdate + ", Meeting start time " + temp.startTime
                    + ", end time " + temp.endTime);

            if (temp.bookingdate == duration.bookingdate) {
                if ((temp.startTime.compareTo(duration.startTime) >= 0
                        && duration.startTime.compareTo(temp.endTime) <= 0) ||
                        (temp.startTime.compareTo(duration.endTime) >= 0
                                && duration.endTime.compareTo(temp.endTime) <= 0))
                    return false;
            }
        }
        bookingInfo.add(duration);
        return true;
    }

}

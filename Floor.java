import java.util.*;

public class Floor {
    int floorNumber;
    List<Room> meetingRooms = new ArrayList<>();

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void addMeetingRoom(int roomNumber) {
        for (Room r : meetingRooms) {
            if (r.roomNumber == roomNumber) {
                System.out.println("Room number is already there");
                return;
            }
        }
        meetingRooms.add(new Room(roomNumber));
        System.out.println("meeting room number " + roomNumber + " successfully added on floor number " + floorNumber);

    }

    public Room getRoom(int roomNumber) {
        for (Room r : meetingRooms) {
            
            if (r.roomNumber == roomNumber) {
                // System.out.println("Room name " + roomNumber);
                return r;
            }
        }
        return null;
    }
}

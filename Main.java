import java.util.*;

public class Main {
    public static List<Building> listOfBuilding = new ArrayList<>();

    public static void addBuilding(Building temp) {
        listOfBuilding.add(temp);
        System.out.println(temp.buildingName + " success fully added building");
        return;
    }

    public static Building getBuilding(String name) {
        for (Building b : listOfBuilding) {
            if (b.buildingName.equals(name))
                System.out.println("Building name " + name);
            return b;
        }
        return null;
    }

    public static void main(String[] args) {
        /*
         * Assumptions
         * meeting timing will always between 0:00 to 23:59
         */

        Building phoenix = new Building("Phoenix");
        addBuilding(phoenix);
        Floor f1 = new Floor(1);
        Floor f2 = new Floor(2);
        Floor f3 = new Floor(3);
        phoenix.addFloor(f1);
        phoenix.addFloor(f2);
        phoenix.addFloor(f3);
        f1.addMeetingRoom(1);
        f1.addMeetingRoom(2);
        f1.addMeetingRoom(3);

        f2.addMeetingRoom(1);
        f2.addMeetingRoom(2);
        f2.addMeetingRoom(3);

        f3.addMeetingRoom(1);
        f3.addMeetingRoom(2);
        f3.addMeetingRoom(3);

        possiblebooking("phoenix", 2, 3, "2:00", "3:00");
        possiblebooking("phoenix", 2, 3, "4:00", "5:00");
        possiblebooking("phoenix", 2, 3, "2:00", "4:00");

    }

    static void possiblebooking(String buildingName, int floorNumber, int roomNumber, String startTime,
            String endTime) {
        System.out.println("I want to do booking on " + buildingName + " building floor number " + floorNumber
                + " room number " + roomNumber + " from " + startTime + " to " + endTime);
        Duration duration = new Duration(roomNumber, startTime, endTime);
        boolean isBookingPossible = getBuilding(buildingName).getFloor(floorNumber).getRoom(roomNumber).bookings
                .isAvailableMeetingRoom(duration);
        if (isBookingPossible == false) {
            System.out.println("sorry another booking is there");
        } else {
            System.out.println("booking done");
        }

    }
}

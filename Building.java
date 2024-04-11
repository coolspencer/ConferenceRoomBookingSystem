import java.util.*;

class Building {
    String buildingName;
    List<Floor> listOfFloor = new ArrayList<>();

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    void addFloor(Floor temp) {
        for (Floor f : listOfFloor) {
            if (f.floorNumber == temp.floorNumber) {
                System.out.println("Floor is already there");
                return;
            }
        }
        listOfFloor.add(temp);
        System.out.println("Floor number " + temp.floorNumber + " successfully added in the building " + buildingName);

    }

    public Floor getFloor(int floorNumber) {
        for (Floor f : listOfFloor) {
            if (f.floorNumber == floorNumber)
                return f;
        }
        return null;
    }
}
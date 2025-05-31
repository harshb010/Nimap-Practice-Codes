public class House {

    private String address = "123 Java Street";

    class Room {
        void showRoomInfo() {
            System.out.println("Member Inner Class: Room belongs to house at " + address);
        }
    }

    public static void main(String[] args) {
        House house = new House();
        House.Room room = house.new Room();
        room.showRoomInfo();
    }
}

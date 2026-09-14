package entities;

public class Room {

    private String name;
    private String email;
    private Integer roomNumber;

    public Room(String name, String email, Integer roomNumber) {
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

}

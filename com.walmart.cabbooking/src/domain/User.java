package domain;

public class User {

    private int id;

    private String name;

    private String email;

    private int phone;

    private Point currentLocation;

    private long totalBooking;

    private long lastBookingDateTime;

    public User(int id, Point currentLocation, long lastBookingDateTime) {
        this.id = id;
        this.currentLocation = currentLocation;
        this.lastBookingDateTime = lastBookingDateTime;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Point getCurrentLocation() {
        return this.currentLocation;
    }

    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }

    public long getTotalBooking() {
        return this.totalBooking;
    }

    public void setTotalBooking(long totalBooking) {
        this.totalBooking = totalBooking;
    }

    public long getLastBookingDateTime() {
        return this.lastBookingDateTime;
    }

    public void setLastBookingDateTime(long lastBookingDateTime) {
        this.lastBookingDateTime = lastBookingDateTime;
    }
}

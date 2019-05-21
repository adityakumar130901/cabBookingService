package domain;

public class Taxi {

    private int id;

    private Category category;

    private Point currentLocation;

    private int agencyId;

    private long lastBookingTime;

    public Taxi(int id, Category category, Point currentLocation, int agencyId, long lastBookingTime) {
        this.id = id;
        this.category = category;
        this.currentLocation = currentLocation;
        this.agencyId = agencyId;
        this.lastBookingTime = lastBookingTime;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Point getCurrentLocation() {
        return this.currentLocation;
    }

    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getAgencyId() {
        return this.agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    public long getLastBookingTime() {
        return this.lastBookingTime;
    }

    public void setLastBookingTime(long lastBookingTime) {
        this.lastBookingTime = lastBookingTime;
    }
}

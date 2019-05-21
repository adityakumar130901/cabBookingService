package domain;

public class Booking {

    private int bookingId;

    private int userId;

    private int agencyId;

    private Category category;

    private long bookingDateTime;

    private double amountCharged;

    private boolean isCancelled;

    public Booking(int bookingId, int userId, int agencyId, Category category, long bookingDateTime, double amountCharged) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.agencyId = agencyId;
        this.category = category;
        this.bookingDateTime = bookingDateTime;
        this.amountCharged = amountCharged;
    }

    public int getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAgencyId() {
        return this.agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getBookingDateTime() {
        return this.bookingDateTime;
    }

    public void setBookingDateTime(long bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public double getAmountCharged() {
        return this.amountCharged;
    }

    public void setAmountCharged(double amountCharged) {
        this.amountCharged = amountCharged;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}

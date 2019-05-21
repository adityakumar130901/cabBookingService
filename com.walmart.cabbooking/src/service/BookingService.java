package service;

import domain.Category;
import domain.Point;

public interface BookingService {

    public int getEstimatedFare(int cityId, Point a, Point b, Category category);

    public int getTotalBooking(int agencyId, Category category);
}

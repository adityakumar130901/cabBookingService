package service;

import dbobjects.LocalHashMap;
import domain.Booking;
import domain.Category;
import domain.FareMap;
import domain.Point;
import exception.BookingNotFoundException;
import exception.CategoryNotFoundException;
import exception.CityNotFoundException;

import java.util.Map;
import java.util.Objects;

public class BookingServiceImpl implements BookingService {

    @Override
    public int getEstimatedFare(int cityId, Point source, Point destination, Category category) {
        double estimatedFare = 0;
        final double cityBaseFare = FareMap.getCityBasicFareMap(cityId);

        if(cityBaseFare == FareMap.INVALID_FAIR) {
            throw new CityNotFoundException("City with ID " + cityId + " is not found for fare estimate");
        }

        final double categoryBaseFair = FareMap.getCategoryBasicFarePerKm(category);

        if(categoryBaseFair == FareMap.INVALID_FAIR) {
            throw new CategoryNotFoundException("Category of type " + category + " is not found for fare estimate");
        }

        final long distance = getDistance(source, destination);

        estimatedFare = cityBaseFare + (categoryBaseFair*distance);

        if(isFareHike(source,destination)) {
            estimatedFare += getCurrentInventoryRequest(source,destination);
        }

        return (int) estimatedFare;
    }

    private boolean isFareHike(Point source, Point destination) {
        long totalUserRequested = getTotalUserRequested(source,destination);
        long totalInventoryAvailable = getTotalInventoryAvailable(source,destination);

        return totalUserRequested > totalInventoryAvailable;
    }

    private double getCurrentInventoryRequest(Point source, Point destination) {
        long totalUserRequested = getTotalUserRequested(source, destination);
        long totalInventoryAvailable = getTotalInventoryAvailable(source, destination);
        return 0.1 * (totalUserRequested / totalInventoryAvailable);
    }

    private long getTotalInventoryAvailable(Point source, Point destination) {
        return 200;
    }

    private long getTotalUserRequested(Point source, Point destination) {
        return 100;
    }

    private long getDistance(Point a, Point b) {
        return 100;
    }

    @Override
    public int getTotalBooking(int agencyId, Category category) {
        Map<Integer, Booking> bookingMap = LocalHashMap.bookingMap;
        if(Objects.isNull(bookingMap)) {
            throw new BookingNotFoundException("No booking is done yet");
        }

        int totalBooking = 0;

        for(Map.Entry entry : bookingMap.entrySet()) {
            Booking booking = (Booking) entry.getValue();
            if(booking.getAgencyId() == agencyId && booking.getCategory() == category) {
                totalBooking++;
            }
        }

        return totalBooking;
    }
}

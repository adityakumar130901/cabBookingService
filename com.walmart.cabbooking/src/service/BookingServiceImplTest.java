package service;

import dbobjects.LocalHashMap;
import domain.Category;
import domain.Point;

public class BookingServiceImplTest {

    public static void main(String[] args) {
        // Initialize db objects
        LocalHashMap.initialize();

        BookingServiceImpl bookingService = new BookingServiceImpl();

        Point p1 = new Point(0,10);
        Point p2 = new Point(0,20);

        System.out.println(bookingService.getEstimatedFare(1, p1, p2, Category.OUTSTATION));

        System.out.println(bookingService.getTotalBooking(1, Category.SUV));


    }
}

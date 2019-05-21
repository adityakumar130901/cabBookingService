package dbobjects;

import domain.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalHashMap {

    public static Map<Integer, Taxi> taxiMap = new HashMap<>();

    public static Map<Integer, Agency> agencyMap = new HashMap<>();

    public static Map<Integer, User> userMap = new HashMap<>();

    public static Map<Integer, City> cityMap = new HashMap<>();

    public static Map<Integer, Booking> bookingMap = new HashMap<>();


    public static void initialize() {
        Point p1 = new Point(0,10);
        Point p2 = new Point(0,20);
        Point p3 = new Point(0,30);
        Point p4 = new Point(0,40);
        Point p5 = new Point(0,50);
        Point p6 = new Point(0,60);


        Taxi taxi1 = new Taxi(1, Category.MINI, p1, 1, System.currentTimeMillis()-1000);
        Taxi taxi2 = new Taxi(2, Category.SEDAN, p2, 2, System.currentTimeMillis()-2000);
        Taxi taxi3 = new Taxi(3, Category.SHARE, p3, 3, System.currentTimeMillis()-3000);
        Taxi taxi4 = new Taxi(4, Category.OUTSTATION, p4, 4, System.currentTimeMillis()-4000);
        Taxi taxi5 = new Taxi(5, Category.SHARE, p5, 1, System.currentTimeMillis()-5000);
        Taxi taxi6 = new Taxi(6, Category.SEDAN, p6, 2, System.currentTimeMillis()-6000);

        taxiMap.put(1, taxi1);
        taxiMap.put(2, taxi2);
        taxiMap.put(3, taxi3);
        taxiMap.put(4, taxi4);
        taxiMap.put(5, taxi5);
        taxiMap.put(6, taxi6);

        List<Taxi> taxi1List = new ArrayList<>();
        taxi1List.add(taxi1);
        taxi1List.add(taxi5);

        List<Taxi> taxi2List = new ArrayList<>();
        taxi2List.add(taxi2);
        taxi2List.add(taxi6);

        List<Taxi> taxi3List = new ArrayList<>();
        taxi3List.add(taxi3);

        List<Taxi> taxi4List = new ArrayList<>();
        taxi1List.add(taxi4);

        Agency agency1 = new Agency(1, "ZOOM1", taxi1List);
        Agency agency2 = new Agency(2, "ZOOM2", taxi2List);
        Agency agency3 = new Agency(3, "ZOOM3", taxi3List);
        Agency agency4 = new Agency(4, "ZOOM4", taxi4List);

        agencyMap.put(1, agency1);
        agencyMap.put(2, agency2);
        agencyMap.put(3, agency3);
        agencyMap.put(4, agency4);

        User user1 = new User(1, p1, System.currentTimeMillis()-10000);
        User user2 = new User(2, p1, System.currentTimeMillis()-10000);
        User user3 = new User(3, p1, System.currentTimeMillis()-10000);
        User user4 = new User(4, p1, System.currentTimeMillis()-10000);

        userMap.put(1, user1);
        userMap.put(2, user2);
        userMap.put(3, user3);
        userMap.put(4, user4);

        Booking booking1 = new Booking(1, 1, 1, Category.MINI, System.currentTimeMillis(), 200.0d);
        Booking booking2 = new Booking(2, 2, 2, Category.SEDAN, System.currentTimeMillis(), 300.0d);
        Booking booking3 = new Booking(3, 3, 3, Category.SHARE, System.currentTimeMillis(), 300.0d);
        Booking booking4 = new Booking(4, 4, 4, Category.OUTSTATION, System.currentTimeMillis(), 300.0d);
        Booking booking5 = new Booking(5, 1, 1, Category.SHARE, System.currentTimeMillis(), 300.0d);
        Booking booking6 = new Booking(6, 2, 2, Category.SEDAN, System.currentTimeMillis(), 300.0d);

        bookingMap.put(1, booking1);
        bookingMap.put(2, booking2);
        bookingMap.put(3, booking3);
        bookingMap.put(4, booking4);
        bookingMap.put(5, booking5);
        bookingMap.put(6, booking6);


    }
}

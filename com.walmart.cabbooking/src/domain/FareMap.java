package domain;

import static domain.Category.*;

public class FareMap {

    public static final int INVALID_FAIR = -1;
    private static final int BANGALORE = 1;
    private static final int CHENNAI = 2;
    private static final int DELHI = 3;
    private static final int KOLKATA = 4;

    public static double getCityBasicFareMap(final int cityId) {
        int baseFair = INVALID_FAIR;
        switch (cityId) {
            case BANGALORE:
                baseFair = 50;
                break;
            case CHENNAI:
                baseFair = 45;
                break;
            case DELHI:
                baseFair = 49;
                break;
            case KOLKATA:
                baseFair = 38;
                break;
        }
        return baseFair;
    }

    public static double getCategoryBasicFarePerKm(final Category category) {
        int baseFair = INVALID_FAIR;
        switch (category) {
            case MINI:
                baseFair = 20;
                break;
            case SEDAN:
                baseFair = 45;
                break;
            case SHARE:
                baseFair = 19;
                break;
            case OUTSTATION:
                baseFair = 58;
                break;
        }
        return baseFair;
    }
}

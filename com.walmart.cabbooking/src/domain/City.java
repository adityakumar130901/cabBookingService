package domain;

public class City {

    private int cityId;

    private String cityName;

    private double cityBaseFair;

    public int getCityId() {
        return this.cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getCityBaseFair() {
        return this.cityBaseFair;
    }

    public void setCityBaseFair(double cityBaseFair) {
        this.cityBaseFair = cityBaseFair;
    }
}

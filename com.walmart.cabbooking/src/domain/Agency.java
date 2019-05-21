package domain;

import java.util.ArrayList;
import java.util.List;

public class Agency {

    private int agencyId;

    private String agencyName;

    private List<Taxi> taxis = new ArrayList<>();

    public Agency(int agencyId, String agencyName, List<Taxi> taxis) {
        this.agencyId = agencyId;
        this.agencyName = agencyName;
        this.taxis = taxis;
    }

    public int getAgencyId() {
        return this.agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    public String getAgencyName() {
        return this.agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public List<Taxi> getTaxis() {
        return this.taxis;
    }

    public void setTaxis(List<Taxi> taxis) {
        this.taxis = taxis;
    }
}

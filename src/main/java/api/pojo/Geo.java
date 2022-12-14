package api.pojo;

import java.util.Objects;

public class Geo {
    private String lat;
    private String lng;

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }
    public Geo(){}

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Geo)) return false;
        if (!super.equals(o)) return false;
        Geo geo = (Geo) o;
        return lat.equals(geo.lat) && Objects.equals(lng, geo.lng);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lat, lng);
    }
}

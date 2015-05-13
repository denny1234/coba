package project2;

class Lokasi {
    double lat, lon;
    String label;

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getLabel() {
        return label;
    }

    public Lokasi(double lat, double lon, String label) {
        this.lat = lat;
        this.lon = lon;
        this.label = label;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

/**
 *
 * @author User
 */
class Titik {
    private int x,y;
    private String label;
    private int nomor;

    Titik(double d, double d0, String adipura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }

    public int getNomor() {
        return nomor;
    }

    public Titik(int x, int y, String label, int nomor) {
        this.x = x;
        this.y = y;
        this.label = label;
        this.nomor = nomor;
    }
}

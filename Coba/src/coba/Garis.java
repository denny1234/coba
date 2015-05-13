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
class Garis {
    private int awal, akhir;
    private String label;
    private int jarak;

    Garis(int i, int i0, String apple) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAwal() {
        return awal;
    }

    public int getAkhir() {
        return akhir;
    }

    public String getLabel() {
        return label;
    }

    public int getJarak() {
        return jarak;
    }

    public Garis(int awal, int akhir, String label, int jarak) {
        this.awal = awal;
        this.akhir = akhir;
        this.label = label;
        this.jarak = jarak;
    }
}

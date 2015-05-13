/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanqueue;

/**
 *
 * @author User
 */
class Nasabah {
    String nama;
    int umur;
    int nomorAntrian = 0;

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setNomorAntrian(int nomorAntrian) {
        this.nomorAntrian = nomorAntrian;
    }
    
    public int getNomorAntrian() {
        return nomorAntrian;
    }

    public Nasabah(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
}

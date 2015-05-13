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
public class LatihanQueue {
    static int kasir = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myQueue DaftarTunggu = new myQueue();
        DaftarTunggu.antri(new Nasabah("Firman",19));
        DaftarTunggu.antri(new Nasabah("Fauzul",35));
        DaftarTunggu.antri(new Nasabah("Ammar",27));
        
        panggil1OrangKeKasir(DaftarTunggu.panggil());
        panggil1OrangKeKasir(DaftarTunggu.panggil());
        
        DaftarTunggu.antri(new Nasabah("Guntur",63));
        DaftarTunggu.antri(new Nasabah("Radit",30));
        DaftarTunggu.antri(new Nasabah("Umar",41));
        
        tampilYangBelumDipanggil(DaftarTunggu);
        
        panggil1OrangKeKasir(DaftarTunggu.panggil());
        panggil1OrangKeKasir(DaftarTunggu.panggil());
        
        tampilYangBelumDipanggil(DaftarTunggu);
    }

    private static void panggil1OrangKeKasir(Nasabah a) {
        kasir = tentukanKasir();
        System.out.println("Nasabah dengan nomor "+a.getNomorAntrian()+" bernama "+a.getNama()+" dengan umur "+a.getUmur()+" menuju kasir "+kasir);
    }

    private static int tentukanKasir() {
        kasir+=1;
        if(kasir > 3){
            kasir = 1;
        }
        return kasir;
    }

    private static void tampilYangBelumDipanggil(myQueue DaftarTunggu) {
        DaftarTunggu.tampilKumpulanNasabah();
    }

   
    
}

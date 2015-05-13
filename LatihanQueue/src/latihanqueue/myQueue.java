/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanqueue;

import java.util.LinkedList;

/**
 *
 * @author User
 */
class myQueue {
    
    private LinkedList<Nasabah> kumpulanNasabah = new LinkedList<Nasabah>();
    int nomorAntrian = 0;
    
    int antri(Nasabah a){
        nomorAntrian+=1;
        a.setNomorAntrian(nomorAntrian);
        kumpulanNasabah.add(a);
        return nomorAntrian;
    }
    
    Nasabah panggil(){
        Nasabah a;
        a = kumpulanNasabah.getFirst();
        kumpulanNasabah.removeFirst();
        return a;
    }

    
}

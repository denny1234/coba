/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Mobil {
    private String merk, warna;
    private int kilometer, tahun;
    private float isiTank;
    
    Mobil(String merk, int tahun, String warna){
        this.merk = merk;
        this.tahun = tahun;
        this.warna = warna;
        kilometer = 0;
        isiTank = 0;
    }
    
    void berjalan(int jarak){
        if(isiTank-(jarak/20)<0){
            System.out.println("Bensin tidak cukup!");
        } else{
            kilometer+=jarak;
            isiTank-=(jarak/15);
        }
    }
    
    void isiBensin(int liter){
        isiTank+=liter;
    }
    
    int getKilo(){
        return kilometer;
    }
    
    float getIsiTank(){
        return isiTank;
    }
    
    
}

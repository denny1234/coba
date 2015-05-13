/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class MobilTest {
    public static void main(String[] args){
        Mobil mobilku = new Mobil("Pajero Sport", 2014, "Putih");
        
        mobilku.berjalan(20);
        System.out.println(mobilku.getIsiTank());
        mobilku.isiBensin(60);
        System.out.println(mobilku.getIsiTank());
        mobilku.berjalan(15);
        System.out.println(mobilku.getIsiTank());
        System.out.println(mobilku.getKilo());
    }
}

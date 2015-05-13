/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args){
        int z=3;
        int y=5;
        int x;
        Scanner masuk = new Scanner(System.in);
        
        for(int i=0;i<6;i++){
            int a = i*y;
            x = z+a;
            System.out.print(x);
        }
        System.out.print("Masukkan nama : ");
        String nama = masuk.nextLine();
        System.out.println(nama);
    }
}

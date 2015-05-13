import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class KontrolJatuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KontrolJatuh extends Actor
{
    public static int jumlah_Batu = 50;
    public static int jumlah_Bintang = 50;
    private int batasJatuh;
    private static int hitungJatuh;
    public  static ArrayList<String> Batu;
    public  static ArrayList<String> Bintang;
    
    public KontrolJatuh(){
        setImage("rock.png");
        hitungJatuh = 0;
        batasJatuh = 5;
    
    }
    public void act() 
    {
       BatuJatuh batuJatuh;
        
        if (hitungJatuh < batasJatuh) {
            if (Greenfoot.getRandomNumber(2) % 2 == 1) {
                batuJatuh = new BatuJatuh();
            }
            
            getWorld().addObject(
                batuJatuh, Greenfoot.getRandomNumber(400), 170
            );
            
            incrementHuruf();
        }
    }
    
    public void incrementHuruf(){
        hitungJatuh--;
    }
}

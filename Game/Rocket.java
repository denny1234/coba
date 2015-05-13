import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        kontrol();
    }    
    
    public void kontrol(){
        if(Greenfoot.isKeyDown("right")){
            this.setImage("rocket_up.png");
            move(10);
        }
        
        if(Greenfoot.isKeyDown("left")){
            this.setImage("rocket_up.png");
            move(-10);
        }
    }
}

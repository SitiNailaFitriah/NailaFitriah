import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Awan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Awan extends Actor
{
    /**
     * Act - do whatever the Awan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() -1, getY());
        if(getX() <= 1){
            setLocation(getX() + 600, Greenfoot.getRandomNumber(250)+50);
        }
    }
}

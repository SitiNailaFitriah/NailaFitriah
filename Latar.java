import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Latar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Latar extends World
{

    /**
     * Constructor for objects of class Latar.
     * 
     */
    public Latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Awan(), 100, 200);
        addObject(new Burung(), 100, 200);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}

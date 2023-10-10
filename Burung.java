import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burung extends Actor
{
    private double g = 1;
    private int y = 300;
    private boolean haspressed = false;
    private boolean isalive = true;
    private boolean isacross = false;
    private boolean hasaddscore = false;
    public Burung ()
    {
        GreenfootImage image = getImage();
        image.scale(80, 60);
    }
    public void act ()
    {
        //Jika menekan spasi, koordinat y akan berkurang dan terbang ke atas
        if(spacePressed()){
            g=-2;
        }
        g +=0.1;
        y += g;
        setLocation(getX(), (int)(y));
        if(isTouchShort()){
            isalive = false;
        }
        if(isTouchShort()){
            isalive = false;
        }
        if(!isalive){
            getWorld().addObject(new Awan(), 300, 200);
            getWorld().removeObject(this);
        }
        if(!hasaddscore && isacross && isalive){
        }
        hasaddscore = isacross;
        
    }
    public boolean spacePressed(){
        boolean pressed = false;
        if(Greenfoot.isKeyDown("Space")){
            if(!haspressed){
                pressed = true;
            }
                haspressed = true;
        }else{
                haspressed = false;
        }
        return pressed;
    }
    public boolean isTouchShort(){
        isacross = false;
        for(Short Short : getWorld().getObjects(Short.class)){
                isalive = false;
            }
            isacross = true;
            return !isalive;
        }   
}
    
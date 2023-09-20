import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cars extends Actor
{
    /**
     * Act - do whatever the cars wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveForward();
        turnRandom();
    }
    
    public void moveForward()
    {
        double angle = Math.toRadians(getRotation() );
        int X= (int) Math. round(getX() + Math.cos(angle) * 5.0);
        int Y= (int) Math.round(getY() + Math.sin(angle) * 5.0);
        
        setLocation(X, Y);
    }
    
    public void turnRandom()
    {
         if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
            System.out.println(Greenfoot.getRandomNumber(100));
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
        {
            turn(180);
        }
    }
}

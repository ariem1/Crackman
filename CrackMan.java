// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CrackMan extends Actor
{
    private GreenfootImage image = getImage();

    /**
     * Act - do whatever the CrackMan wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moving();
        eatTacos();
        eatPowerup();
    }

    /**
     * 
     */
    public void moving()
    {
        move(2);
        if (Greenfoot.isKeyDown("w")) {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("s")) {
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("a")) {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("d")) {
            setRotation(0);
        }
    }

    /**
     * 
     */
    public void eatTacos()
    {
        Actor taco = getOneIntersectingObject(Tacos.class);
        if (taco != null) {
            getWorld().removeObject(taco);
        }
    }

    /**
     * 
     */
    public void eatPowerup()
    {
        Actor line = getOneIntersectingObject(Powerup.class);
        if (line != null) {
            getWorld().removeObject(line);
        }
    }
}

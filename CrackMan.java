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
    private int direction;

    /**
     * 
     */
    public CrackMan()
    {
        direction = 0;
    }

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
        if (Greenfoot.isKeyDown("d")) {
            direction = 0;
        }
        if (Greenfoot.isKeyDown("w")) {
            direction = 1;
        }
        if (Greenfoot.isKeyDown("a")) {
            direction = 2;
        }
        if (Greenfoot.isKeyDown("s")) {
            direction = 3;
        }
        if (direction == 0) {
            move(2);
            setImage("Crackman_right.png");
            setRotation(0);
        }
        if (direction == 1) {
            move(2);
            setImage("Crackman_right.png");
            setRotation(270);
        }
        if (direction == 2) {
            move(2);
            setImage("Crackman.png");
            setRotation(180);
        }
        if (direction == 3) {
            move(2);
            setImage("Crackman_right.png");
            setRotation(90);
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

// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SplashScreen extends World
{

    /**
     * Constructor for objects of class SplashScreen.
     */
    public SplashScreen()
    {
        super(900, 900, 1);
        prepare();
    }

    /**
     * 
     */
    public void act()
    {
        if (exit()) {
            Greenfoot.setWorld( new  MainMenu());
        }
    }

    /**
     * 
     */
    public boolean exit()
    {
        boolean skip = false;
        if (Greenfoot.isKeyDown("space")) {
            skip = true;
        }
        return skip;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootImage drawedImage =  new  GreenfootImage("VanierLOGO.png");
        getBackground().drawImage(drawedImage, 100, 200);
    }
}

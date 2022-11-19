// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MainMenu extends World
{
    public static int score = 0;

    /**
     * Constructor for objects of class MainMenu.
     */
    public MainMenu()
    {
        super(900, 900, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ghost1 ghost1 =  new Ghost1();
        addObject(ghost1, 503, 558);
        CrackMan crackMan =  new CrackMan();
        addObject(crackMan, 190, 351);
        Tacos tacos =  new Tacos();
        addObject(tacos, 660, 172);
        Tacos tacos2 =  new Tacos();
        addObject(tacos2, 708, 244);
        Tacos tacos3 =  new Tacos();
        addObject(tacos3, 592, 286);
        Tacos tacos4 =  new Tacos();
        addObject(tacos4, 662, 392);
        Tacos tacos5 =  new Tacos();
        addObject(tacos5, 770, 355);
        Tacos tacos6 =  new Tacos();
        addObject(tacos6, 769, 491);
        Tacos tacos7 =  new Tacos();
        addObject(tacos7, 562, 554);
        Tacos tacos8 =  new Tacos();
        addObject(tacos8, 748, 618);
        Tacos tacos9 =  new Tacos();
        addObject(tacos9, 733, 548);
        Tacos tacos10 =  new Tacos();
        addObject(tacos10, 660, 489);
        Tacos tacos11 =  new Tacos();
        addObject(tacos11, 791, 447);
        removeObject(ghost1);
    }

    /**
     * 
     */
    public void act()
    {
        scoreSystem(score);
    }

    /**
     * 
     */
    public void scoreSystem(int score)
    {
        showText("Score: " + score, getWidth() / 2, getHeight() / 2);
    }
}

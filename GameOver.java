import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Label titleLabel = new Label("Game Over", 50);
    Label finalScoreLabel = new Label("Wombat killed: " + MyWorld.getScore() + " bugs.", 35);
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        addObject(titleLabel, getWidth()/2, 100);
        addObject(finalScoreLabel, getWidth()/2, 200);
        
        Return back = new Return();
        addObject(back, 560, 297);
    }
}

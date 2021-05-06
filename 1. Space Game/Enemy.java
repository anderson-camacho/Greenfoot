import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author Anderson Camacho 
 * @version 1.0
 */ 
public class Enemy extends Actor
{
    /**
     * Constructor de Enemy, genera rotacion inical de 270 grados
       */
      
    public Enemy()
    {  
      
    }
    
    /**
     * Metodo (Procedimeinto) de ejecucion constante
       */
    public void act() 
    {
        // Add your action code here.
    }  
    
    /**
     * Metodos de RocketSpace
     */ 
    
    public void moveEnemy()
    {
        setLocation(getX(), getY()+3);
    }
    
    public void removeEnemy()
    {
        if(getY() == 599)
        {
            getWorld().removeObject(this);
        }
    }
}

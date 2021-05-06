import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * 
 * @author Anderson Camacho 
 * @version 1.0
 */ 
class Projectile extends Actor
{
    /**
     * Constructor de Projectile
     */
    public Projectile()
    {
    }
    
    /**
     * Metodo (Procedimeinto) de ejecucion constante
     */
    public void act() 
    {
        projectileMove();
        removeFromWorld();
    } 
    
    /**
     * Metodos de Projectile
     */
    
    public void projectileMove()
    {
        setLocation(getX(), getY() - 10);
    }
    
    public void removeFromWorld()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null)
        {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        } else if(getY() == 0)
        {
            getWorld().removeObject(this);
        }
    }
    
}

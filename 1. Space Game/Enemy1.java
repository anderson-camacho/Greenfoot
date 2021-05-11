import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author Anderson Camacho 
 * @version 1.0
 */ 
public class Enemy1 extends Enemy
{
    /**
     * Constructor de Enemy1, genera rotacion inical de 270 grados
       */
    public Enemy1()
    {
       
    }
    
    /**
     * Metodo (Procedimeinto) de ejecucion constante
       */
     public void act() 
    {
        moveEnemy();
        hitByProjectile();
    }    
    
    /**
     * Metodos de Enemy1
     */  
    
    public void hitByProjectile(){
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null)
        {
            getWorld().removeObject(projectile);
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        } else if(getY() == 599)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthBar = myWorld.getHealthBar();
            healthBar.loseHealth();
            getWorld().removeObject(this);
        }
    }
}

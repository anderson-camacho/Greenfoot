import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author Anderson Camacho 
 * @version 1.0
 */ 
public class Enemy2 extends Enemy
{
    private int timerHit = 2;
    /**
     * Constructor de Enemy2, genera rotacion inical de 270 grados
     */
    public Enemy2()
    {

    }

    public int getTimerHit(){
        return this.timerHit;
    }

    public void setTimerHit(int timerHit){
        this.timerHit = timerHit;
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
     * Metodos de Enemy2
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
            timerHit--;
        }
        
        if(timerHit == 0){
            getWorld().removeObject(this);
        }else if(getY() == 599)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthBar = myWorld.getHealthBar();
            healthBar.loseHealth();
            healthBar.loseHealth();
            getWorld().removeObject(this);
        }
        
    }
}

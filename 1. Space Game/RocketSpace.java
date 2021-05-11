import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RocketSpace here.
 * 
 * @author Anderson Camacho
 * @version 1.0 | 5 - 5 - 2021
 */
public class RocketSpace extends Actor
{
    Boolean canFire = true; 
    /**
     * Constructor de RocketSpace, genera rotacion inical de 270 grados
     */
    public RocketSpace()
    {
        setRotation(270);
    }

    /**
     * Metodo (Procedimeinto) de ejecucion constante
     */
    public void act() 
    {
        moveAround();
        fireProjectile();
    }   

    /**
     * Metodos de RocketSpace
     */

    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5, getY());
        }

    }

    public void fireProjectile()
    {
        if(Greenfoot.isKeyDown("space") && canFire == true){
            getWorld().addObject(new Projectile(), getX(), getY()-30);
            canFire = false;
            Greenfoot.playSound("disparoLaser.mp3");
        } else if(!Greenfoot.isKeyDown("space")){
            canFire =true;   
        }

    }
}

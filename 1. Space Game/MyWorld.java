import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Space Game - Ejercicio Oracle Academy.
 * 
 * Realizar ejercicio de programacion de juego, 
 * en el cual veremos con programacion Orienta a Objeto en Java
 * Los elementos necesarios para aprender a programar.
 * 
 * @author Anderson Camacho 
 * @version 1.0
 */
public class MyWorld extends World
{
    /**
     * Constructor de MyWorld, genera rotacion inical de 270 grados
       */
    public MyWorld()
    {  
        super(600, 600, 1);//la declaracion del tamaño de el lienzo del juego
        prepare();
    }
    
    /**
     * Metodo (Procedimeinto) de ejecucion constante
       */
    public void act() 
    {
        addEnemy1();
        addEnemy2();
    } 

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        RocketSpace rocketSpace = new RocketSpace();
        addObject(rocketSpace,300,540);
    }
    
    /**
     * Metodos de Projectile
     */
    
    public void addEnemy1()
    {
        if(Greenfoot.getRandomNumber(100)<10)//un ratio porcentual de cantidad de enemigos
        {
            addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 0);
        }
            
    }
    
    public void addEnemy2()
    {
        if(Greenfoot.getRandomNumber(100)<2)//un ratio porcentual de cantidad de enemigos
        {
            addObject(new Enemy2(), Greenfoot.getRandomNumber(600), 0);
        }
            
    }
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 ******************Space Game*****************
 * 
 *  Ejercicio de Uso Libre
 * 
 *  No se permite la comercializacion de este codigo.
 * 
 *  Realizar ejercicio de programacion de juego, 
 *  en el cual veremos con programacion Orienta a Objeto en Java
 *  Los elementos necesarios para aprender a programar.
 *  Este ejercicio puede mejorarse aun mas en cuestion de codigo
 * 
 * @author Anderson Camacho 
 * @email: camachosinh@gmail.com
 * @version general 1.5
 * 
 * nota: falta docuemtnar despues despues de enemigos.
 * 
 * Nota del desarrollador:
 * 
 * Este codigo fue tomado de canal de o youtube Coding Club 
 * (https://www.youtube.com/c/CodingClub/about) y se 
 * actualizando elementos a codigo estandarizado. 
 */
public class RocketSpace extends Actor
{
    /**
     * Declaraciones
     */
    Boolean canFire = true; 

    /**
     * Constructor
     */
    public RocketSpace()
    {
        setRotation(270);
    }

    /**
     * Metodos getter and setters
     */
    /**
     * Metodos Action que se ejecuta siempre que el objeto exista
     */
    public void act() 
    {
        moveAround();
        fireProjectile();
    }   

    /**
     * Metodo preparacion de los elementos de esta Clase
     */
    private void prepare()
    {
    }

    /**
     * Metodos de RocketSpace completos y con elementos completos no estandares.
     */

    //El proceso de mover con las teclas de teclado
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5, getY());
        }

    }

    //Accion de dispoaro para disparar
    public void fireProjectile()
    {
        if(Greenfoot.isKeyDown("space") && canFire == true){
            getWorld().addObject(new Projectile(), getX(), getY()-30);
            canFire = false;
            Greenfoot.playSound("disparoLaser.mp3");//Accion de sonido
        } else if(!Greenfoot.isKeyDown("space")){
            canFire =true;   
        }

    }
}

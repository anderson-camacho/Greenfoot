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
 * @version general 1.3
 * 
 * Nota del desarrollador:
 * 
 * Este codigo fue tomado de canal de o youtube Coding Club 
 * (https://www.youtube.com/c/CodingClub/about) y se 
 * actualizando elementos a codigo estandarizado. 
 */
public class Enemy extends Actor
{
    /**
     * Declaraciones
     */
    /**
     * Constructor
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
     * Metodos Action que se ejecuta siempre que el objeto exista
     */
    //Procedimientos de movimientos
    public void moveEnemy()
    {
        setLocation(getX(), getY()+3);//Mover el objeto con los elementos 
    }

    //Procedimeinto estandar de eliminacion del objeto Enemy el cual es padre de todos los Enemys
    public void removeEnemy()
    {
        if(getY() == 599)//599 es el valor final del tablero, recuerda que estamos en tablero de 600 x 600 y de arriba hacia abajajo o de derecha a izquierda de 0 a 600 en este caso antes de 600 599.
        {
            getWorld().removeObject(this);//se remueve el objeto
        }
    }
}

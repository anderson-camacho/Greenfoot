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
public class HealthBar extends Actor
{
    /**
     * Declaraciones
     */
    int health = 20;
    int healthBarWidth = 80;
    int healthBarHeight = 10;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;

    /**
     * Constructor
     */
    public HealthBar()
    {
        update();
    }
    /**
     * Metodos getter and setters
     */
    /**
     * Metodos Action que se ejecuta siempre que el objeto exista
     */
    public void act() 
    {
        update();
        youLose();
    }

    /**
     * Metodo preparacion de los elementos de esta Clase
     */
    private void prepare()
    {
    }

    /**
     * Metodos de HealthBar completos y con elementos completos no estandares.
     */
    public void update()
    {
        setImage(new GreenfootImage (healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, health*pixelsPerHealthPoint, healthBarHeight);
    }

    public void loseHealth()
    {
        health--;
    }

    public void youLose()
    {
        if(health == 0)
        {
            getWorld().addObject(new YouLose(), 300, 300);
            Greenfoot.stop();
        }
    }
}

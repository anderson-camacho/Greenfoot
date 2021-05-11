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

public class Counter extends Actor
{
    /**
     * Declaraciones
     */
    //Variable de puntuacion del juego
    private int score = 0;

    /**
     * Constructor
     */
    public Counter()
    {
        setImage(new GreenfootImage("Score: " + this.score, 40, Color.GREEN, Color.BLACK));
    }

    /**
     * Metodos getter and setters
     */

    public int getScore()
    {
        return score;
    }

    public void setScore(int score/*Varaible Local*/)
    {
        this.score=score;
    }

    /**
     * Metodos Action que se ejecuta siempre que el objeto exista
     */

    public void act() 
    {
        setImage(new GreenfootImage("Score: " + this.score, 40, Color.GREEN, Color.BLACK));
        YouWin();
    }  

    /**
     * Metodo preparacion de los elementos de esta Clase
     */
    private void prepare()
    {
    }

    /**
     * Metodos de Counter completos y con elementos completos no estandares.
     */
    
    //Metodo de icremento de puntos en el objeto existente
    public void addScore(){
        this.score++;        
    }

    //Metodo de tablero que permite ganar 
    public void YouWin()
    {
        if (score >= 50){
            getWorld().addObject(new YouWin(), 300, 300);
            Greenfoot.stop();
        }
    }
}

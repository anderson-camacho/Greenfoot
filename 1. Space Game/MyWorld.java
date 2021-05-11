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

//Clase hija de world, lo vemos ya que hereda de World(Extends)
//Esta clase es la que permita crear literalemnte el mundo y podemos 
//crear diferentes de acuerdo a nuestras necesidades
//Es importante que verifiques otrso codigos de otros creadores para saber como lo han hecho ellos.

public class MyWorld extends World
{
    /**
     * Declaraciones
     */
    //Objeto que permite la existencia de la barra de vida en el tablero.
    HealthBar healthBar = new HealthBar();

    //Objeto que permite la existencia de la contador de puntos en el tablero
    Counter counter = new Counter();

    //Variable Booleana que facilita la aparecion unica de del Enemigo Jefe mas poderozo del juego.
    boolean bossLevel = false;

    /**
     * Constructor
     */
    public MyWorld()
    {  
        super(600, 600, 1);//la declaracion del tamaño de el lienzo del juego
        prepare();
    }

    /**
     * Metodos getter and setters
     */
    public HealthBar getHealthBar(){
        return this.healthBar;
    }

    public void setHealthBar(HealthBar healthBar){
        this.healthBar = healthBar;
    }

    public Counter getCounter(){
        return this.counter;
    }

    public void setCounter(Counter counter){
        this.counter = counter;
    }

    public boolean getBossLevel(){
        return this.bossLevel;
    }

    public void setBossLevel(boolean bossLevel){
        this.bossLevel = bossLevel;
    }

    /**
     * Metodos Action que se ejecuta siempre que el objeto exista
     */

    public void act() 
    {
        //Enemigos agregados con procedimientos
        addEnemy1();
        addEnemy2();
    } 

    /**
     * Metodo preparacion de los elementos de esta Clase
     */
    private void prepare()
    {
        //Procedimientos que permiten la creacion de los elementos que estaran sobre el tablero
        addObject(healthBar,300,50);//agrega barra de vida
        addObject(counter,100,50);//agrega contador de puntos
        RocketSpace rocketSpace = new RocketSpace();//creal el objeto de juego
        addObject(rocketSpace,300,540);//agrega el objeto anterior (el objeto principal del juego.)
    }

    /**
     * Metodos de MyWorld completos y con elementos completos no estandares.
     */

    public void addEnemy1()
    {
        if(Greenfoot.getRandomNumber(100)<2)//un ratio porcentual de cantidad de enemigos
        {
            addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 0);
        }

    }

    public void addEnemy2()
    {
        if(Greenfoot.getRandomNumber(100)<1)//un ratio porcentual de cantidad de enemigos
        {
            addObject(new Enemy2(), Greenfoot.getRandomNumber(600), 0);
        }

    }

    public void Boss(){
        if(counter.getScore() == 25 || counter.getScore() == 26){
            if(bossLevel == false){
                addObject(new Boss(), 300, 0);
                bossLevel = true;
            }
        }

    }
}

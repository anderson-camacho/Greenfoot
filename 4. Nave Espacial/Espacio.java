import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase tendra como objetivo ser el espacio donde se moveran los objetos
 * identificados para este juego. 
 * Ejercico de apoyo, para clase.
 * 
 * Ejercicio numero de Greenfoot
 * 
 * Objetos del juego: Nave, Rocas, Disparos, vidas.
 * 
 * @author camachosinh 
 * @version 1.1 18.8.2020
 */
public class Espacio extends World
{
    //Atributos,Parametros o propiedasdes de la clase.

    //Objeto tipo clase vida el cual me facilita la manipulacion de la vidas
    private lifes ObjetoLife; 
    private Tablero vidas;

    //Contructor    
    public Espacio()
    {    
        super(1024, 780, 1); 
        setPaintOrder(Tablero.class, roca.class, nave.class);//aparecer en orden en el espacio
        prepare();
    }//fin del contructor

    //getter and setter
    public Tablero getVidas()
    {
        return this.vidas;
    }

    public void setVidas(Tablero vidas){
        this.vidas = vidas;
    }

    public lifes getObjetoLife(){
        return this.ObjetoLife;
    }//fin del get

    public void setObjetoLife(lifes nuevoObjeto){
        this.ObjetoLife = nuevoObjeto;
    }// Find el set de objetolife

    //Procedemiento de llamado apra creacion de elementos del mundo
    private void prepare()
    {
        crearVidas();
        crearRocas(10);
        crearNave();
    }//Fin de prepare
    //Procedimientos de creacion de objetos en el Espacio de trabajo
    //Procedimiento de  crreacion de la nave
    private void crearNave(){
        nave nave = new nave();
        addObject(nave,507,395);
    }//Fin de crearNave

    //Procedemeinto de creacion de rocas
    private void crearRocas(int cantidadRocas){
        for(int i = 0; i < cantidadRocas; i++){
            roca r = new roca();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(r, x, y);
        }
    }//fin de crearRocas

    //procedimeinto de creacion de vidas
    private void crearVidas()
    {
        this.ObjetoLife = new lifes();
        vidas = new Tablero(ObjetoLife.getLifes(), "vidas");
        addObject(vidas, 150, 85);
    }//fin crearVidas
}//Fin de la clase

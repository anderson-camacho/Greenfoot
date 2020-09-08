import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 *La clase Vidas nos permite poder aacceder a una cantidad de posibilidades de juego maximo..
 * 
 * @author camachosinh 
 * @version 1.2 18.8.2020
 */
public class lifes extends Actor
{
    //Atributos,Parametros o propiedasdes de la clase.
    private int c = 3;

    //Contructor
    public lifes(){}

    //Get a set

    public int getLifes()
    {
        return this.c;
    }//fin delgetLifes

    //procedemiento de escucha
    public void act(){}    

    //Procedeimeinto de edicion de la cantidad de las vidas.
    public void Disminuir(){
        this.c--;
        if(this.c == 0)
        {
            Greenfoot.stop();
        }

    }//fin de Disminuir
}//Fin de la clase

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase disparo que permite encontrar el proceso de la bala disparada en la escena de juego
 * 
 * @author camachosinh 
 * @version 1.1 18.8.2020
 */
public class shot extends Actor
{
    private int posicion;
    private int velocidadDisparo = 8;

    //constructor
    public shot(int direccion){
        this.posicion = direccion;
    }

    public void act() 
    {
        disparo();
        eliminarDisparo();
    }    

    //Eliminacion final del disparo
    private void eliminarDisparo(){

        if((getX() >= getWorld().getWidth()-5)||(getX() <= 5))
        {
            getWorld().removeObject(this);
        }else{
            if((getY() >= getWorld().getHeight()-5)||(getY()<=5))
            {
                getWorld().removeObject(this);
            }
        }
    }//fin eliminar disparo

    //Disparo de la nave
    private void disparo()
    {
        switch(this.posicion){
            case 0:
            setLocation(getX(),getY()-this.velocidadDisparo);
            break;
            case 1:
            setLocation(getX(),getY()+this.velocidadDisparo);
            break;
            case 2:
            setLocation(getX()+this.velocidadDisparo,getY());
            break;
            case 3:
            setLocation(getX()-this.velocidadDisparo,getY());
            break;
        }
    }//fin disparo
}// fin clase

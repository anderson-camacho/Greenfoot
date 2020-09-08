import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Esta clase permite que realizemos la publicacion del tablero de finalizacion de proyecto
 * @author camachosinh 
 * @version 1.1 18.8.2020
   */

public class JuegoTerminado extends Actor
{
    GreenfootImage imagen;
    String mensaje;
    
    //Constructor    
    public JuegoTerminado()
    {
        imagen = new GreenfootImage(512,390);
        Color color = getImage().getColor();
        imagen.setColor(color.YELLOW);
        imagen.drawString("Juego Terminado", 0, 100);
        setImage(imagen);
        Greenfoot.stop();
    }//diin del constructor
    
    //Getter an d setter
    
    public GreenfootImage getImagen()
    {
        return this.imagen;
    }

    public void setImagen(GreenfootImage imagen)
    {
        this.imagen = imagen;
    }

    public String getMensaje()
    {
        return this.mensaje;
    }

    public void setMensaje(String mensaje)
    {
        this.mensaje = mensaje;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}

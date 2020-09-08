import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Tablero permite enviarle una variable String y una variable numerica que recibe para publicar en un lugar especifico.
 * @author camachosinh 
 * @version 1.1 18.8.2020
   */

public class Tablero extends Actor
{
    private GreenfootImage imagen;//Variable que permite tener uina variable que administra una imagen
    private int contador;//numeor a recibir de form aexterna, valor global
    private String mensaje;// variable que recibe el menasaje de forma global

    //contructor

    public Tablero(int contador, String mensaje)
    {
        this.contador = contador;
        this.mensaje = mensaje;
        this.imagen = new GreenfootImage(250,150);
        funcionalidad();
    }

    //getter  and setter

    public GreenfootImage getImagen()
    {
        return this.imagen;
    }

    public void setImagen(GreenfootImage imagen)
    {
        this.imagen = imagen;
    }

    public int getContador()
    {
        return this.contador;
    }

    public void setContador(int contador)
    {
        this.contador = contador;
    }

    public String getMensaje()
    {
        return this.mensaje;
    }

    public void setMensaje(String mensaje)
    {
        this.mensaje = mensaje;
    }

    
    //Metodo de escucha indefinida
    public void act() 
    {

    }    

    //Procediento de funcionalidad general
    private void funcionalidad()
    {
        Color color = getImage().getColor();
        this.imagen.setColor(color.YELLOW);
        dibujar();
    }//fin funcionalidad

    //Procedimeitno para dibujar los mensjaes enviados a la instancia de tipo tablero
    private void dibujar()
    {
        imagen.clear();
        imagen.drawString(getMensaje()+": "+getContador(), 20, 20);
        setImage(imagen);
    }//fin dibujar

    //Procedimeinto para sumar 1 a la varible contador
    public void incrementar()
    {
        this.contador++;
        dibujar();
    }//fin incrementar

    //procedimiento para restar 1 a ña variable contador
    public void decrementar()
    {
        this.contador--;
        dibujar();
    }//fin decrementar
}//fin de la clase

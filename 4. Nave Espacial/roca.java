import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que roca permite tener todos los funcionamientos de la roca, moviemiento aleatorio 
 * y ademas el choque con la nave
 * @author camachosinh 
 * @version 1.1 18.8.2020
 */
public class roca extends Actor
{
    public void act() 
    {
        movimientoRoca();
        choque();
        
    }
    
    //choque de las rocas contra la nave
    
    private void choque()
    {
        Actor nave = getOneObjectAtOffset(0, 0, nave.class);
        if(nave != null){
            Espacio Espacio = (Espacio)getWorld();
            getWorld().removeObject(nave);
            getWorld().addObject(new nave(), 512, 490);
            Espacio.getObjetoLife().Disminuir();
        }
    }//fin choque
    
    
    //Movimeinto de rocas aleatorios
    public void movimientoRoca()
    {
        move(5);
        World mundo = getWorld();
        if(getX() >= mundo.getWidth()-5 || getX() <=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        if(getY() >= mundo.getWidth()-5 || getY() <=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        
        Actor nave = getOneObjectAtOffset(0, 0, nave.class);
        if(nave != null)
        {
            Espacio espacio = (Espacio)getWorld();
            getWorld().removeObject(nave);
            espacio.getVidas().decrementar();
            getWorld().addObject(nave, 300, 390);
            if(espacio.getVidas().getContador() == 0)
            {
                JuegoTerminado texto = new JuegoTerminado();
                getWorld().addObject(texto, (getWorld().getWidth()/2)+150, (getWorld().getHeight()/2));
                }
        }
    }//fin moviemeintos de roca
}//fin clase

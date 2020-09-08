import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * La nave es la clase que permite anexar el elemento que controlara el usuario.
 * El uso de esta herramienta en el juego tendra las caracterisiticas especificadas en los atributos
 * indicados al inciio de la clase.
 * 
 * @author camachosinh 
 * @version 1.2 18.8.2020
 */

public class nave extends Actor
{
    //Atributos,Parametros o propiedasdes de la clase.

    //Constantes declaradas
    private static final int UP=0;//constante
    private static final int DOWN=1;//constante
    private static final int LEFT=2;//constante
    private static final int RIGHT=3;//constante

    //Varables declaras
    private int direccionDisparo = 2;// direccion del disparo de acuerdo al moviemineto que lleva la nave
    private boolean isShot =false;//bandera que permite entrar al estado de disparo.

    //Constructor
    public nave(){}
    
    //getter and setter
    public int getDireccionDisparo(){
        return this.direccionDisparo;
    }

    public void setDireccionDisparo(int nuevaDireccionDisparo){
        this.direccionDisparo = nuevaDireccionDisparo;
    }

    public int getDOWN(){
        return this.DOWN;
    }

    public int getLEFT(){
        return this.LEFT;
    }

    public int getRIGHT(){
        return this.RIGHT;
    }

    public int getUP(){
        return this.UP;
    }

    //procedemiento de escucha
    public void act()
    {
        moverNave();
        setShot(getDireccionDisparo());
    }//fin del act

    //contol de mover la nave bajo apoyo de otros procedemientos
    private void moverNave()
    {
        if(Greenfoot.isKeyDown("up")){
            setDireccion(getUP());
            setDireccionDisparo(0);
        }
        if(Greenfoot.isKeyDown("down")){
            setDireccion(getDOWN());
            setDireccionDisparo(1);
        }
        if(Greenfoot.isKeyDown("left")){
            setDireccion(getLEFT());
            setDireccionDisparo(3);
        }
        if(Greenfoot.isKeyDown("right")){
            setDireccion(getRIGHT());
            setDireccionDisparo(2);
        }

    }//fin de moverNave

    //procedimeinto de disparos de la nave
    public void setShot(int disparo)
    {
        if(isShot && Greenfoot.isKeyDown("x")){
            shot bala = new shot(getDireccionDisparo());
            getWorld().addObject(bala, getX(),getY());
            this.isShot=false;
        }
        if(!isShot && !Greenfoot.isKeyDown("x")){
            this.isShot=true;
        }

    }//fin de setShot

    //Procedimeinto que permite dar direccion a la nave
    public void setDireccion(int direccion){
        switch(direccion){
            case 0:
            setRotation(270);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX(), getY()-10);
            }else{
                setLocation(getX(), getY()-2);
            }
            break;

            case 1:
            setRotation(90);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX(), getY()+10);
            }else{
                setLocation(getX(), getY()+2);
            }
            break;

            case 2:
            setRotation(180);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX()-10, getY());
            }else{
                setLocation(getX()-2, getY());
            }
            break;

            case 3:
            setRotation(0);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX()+10, getY());
            }else{
                setLocation(getX()+2, getY());
            }
            break;
        }
    }//fin procedimeinto de direccion

}//fin clase

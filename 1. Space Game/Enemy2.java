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
public class Enemy2 extends Enemy
{
    /**
     * Declaraciones
     */
    private int timerHit = 2;

    /**
     * Constructor
     */
    public Enemy2()
    {

    }/**
     * Metodos getter and setters
     */

    public int getTimerHit(){
    return this.timerHit;
    }

    public void setTimerHit(int timerHit){
        this.timerHit = timerHit;
    }

    /**
     * Metodos Action que se ejecuta siempre que el objeto exista
     */
    public void act() 
    {
        moveEnemy();
        hitByProjectile();
    }    

    /**
     * Metodo preparacion de los elementos de esta Clase
     */
    private void prepare()
    {
    }

    /**
     * Metodos de Enemy2 completos y con elementos completos no estandares.
     */

    public void hitByProjectile(){

        //Creacion de elementos que facilitaran la elimincacion de los datos
        //en este caso eliminaremos el objeto actual creado.
        //Se crea el objeto Projectile y que asigna la informacion necesaria del projectile disparado
        //Este tendra una informacion y en caso de que sea nulo, cuando se encuentra una interseccion con
        //getOneIntersectingObject que permitira darte una respuesta null o con datos.
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null)
        {
            //Cuando no sea null empesaremos con los siguientes pasos
            //Solicitamos al Mundo a traves de su get removemos objetos
            getWorld().removeObject(projectile);
            //Luegop creamos un objeto de tipo World que alamacenara toda la informacion
            //de World de forma local, permitiendo trabajar con los datos espscificos en este espacio
            World world = getWorld();
            //Creacmos tambien una formulacion y casteo con otro objeto de tipo  MyWorld
            MyWorld myWorld = (MyWorld)world;
            //Esto anterior permitira que podamos tener de forma local acceso los elemento 
            //correspondientes a el contador el cual necesitamos para aumantar los puntos
            Counter counter = myWorld.getCounter();//se accede a getCounter
            counter.addScore();//se inbcrementa la informacion
            timerHit--;//se resta los golpes que se necesitan para matar el Enemy1
        }

        if(timerHit == 0){
            getWorld().removeObject(this);
        }else if(getY() == 599)
        {
            //en caso de que llegue al fondo del mapa y no se elimine, permitira entronces eliminarse,
            //pero tambien tenemos que verificar que la barra de vida disminuya, por eso se debe disminuir la vida.
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthBar = myWorld.getHealthBar();
            healthBar.loseHealth();
            healthBar.loseHealth();
            getWorld().removeObject(this);
        }

    }
}

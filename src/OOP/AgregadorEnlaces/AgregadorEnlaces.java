package OOP.AgregadorEnlaces;

/**
 * La clase encargada sobre un agregador de enlaces
 * @version 23 de agosto 2021
 * @author Sivana Hamer
 */
public class AgregadorEnlaces {
    //Atributos
    private String enlace; //url
    private int cantidadClics; //cantidad de clics que se hacen al URL

    //Constructor
    /**
     * Constructor de agregador de enlaces con un enlace
     * @param enlace Enlace que se esta monitoreando
     */
    public AgregadorEnlaces(String enlace){
        this.enlace = enlace;
        this.cantidadClics = 0;
    }

    //Metodos
    /**
     * Annadir a los clics totales los clics nuevos
     * @param cantidadClicsNuevas Clics nuevos a agregar
     */
    public void annadirClics(int cantidadClicsNuevas){
        this.cantidadClics += cantidadClicsNuevas;
        // this.cantidadClics = this.cantidadClics + cantidadClicsNuevas; Lo mismo
    }

    /**
     * Imprime la informacion del agregador de enlaces
     */
    public void imprimir(){
        System.out.println("Enlace: " + this.enlace);
        System.out.println("Cantidad de clics: " + this.cantidadClics);
    }
}
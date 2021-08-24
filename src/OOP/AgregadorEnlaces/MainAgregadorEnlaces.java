package OOP.AgregadorEnlaces;

/**
 * Clase que guarda el main de agregador del enlaces
 * @version 23 de agosto 2021
 * @author Sivana Hamer
 */
public class MainAgregadorEnlaces {
    public static void main(String [] args){
        AgregadorEnlaces agregradorEnlaces = new AgregadorEnlaces("youtube.com");
        agregradorEnlaces.annadirClics(10);
        agregradorEnlaces.imprimir();
        agregradorEnlaces.annadirClics(20);
        agregradorEnlaces.imprimir();
    }

}
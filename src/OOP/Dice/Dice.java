package OOP.Dice;

/**
 * Simula un Dado
 * @version 27-08-2021
 * @author Sivana Hamer
 */
public class Dice {
    //Atributos
    private int caras; //Caras que tiene el dado

    //Constructor
    /**
     * Constructor por defecto del dado
     * @param caras La cantidad de caras del dado
     */
    public Dice(int caras){
        this.caras = caras;
    }

    //Metodos
    /**
     * Simula tirar un dado
     * @return La cara seleccionada
     */
    public int roll(){
        double numberFloat = Math.random() * this.caras + 1;
        return (int) numberFloat;
    }

    /**
     * Imprime las caras del dado
     */
    public void imprimir(){
        System.out.printf("El dado tiene %d caras%n", this.caras);
    }
}

package OOP.Complejo;

/**
 * Main de los numeros complejos
 * @author Sivana Hamer
 * @version 23-08-2021
 */
public class MainComplejo {
    public static void main (String [] args){
        //Instancia los numeros complejos
        Complejo c1 = new Complejo(5, 5);
        Complejo c2 = new Complejo(1,2);

        //Obtiene la suma de ambos numeros complejos
        Complejo suma = c1.sumar(c2);
        System.out.printf("Suma: %s%n", suma.convertir());

        //Obtiene la resta de ambos numeros complejos
        Complejo resta = c1.restar(c2);
        System.out.printf("Resta: %s%n", resta.convertir());

        //Obtiene la multiplicacion de ambos numeros complejos
        Complejo multiplicacion = c1.multiplicar(c2);
        System.out.printf("Multiplicacion: %s%n", multiplicacion.convertir());

        //Obtiene la division de ambos numeros complejos
        Complejo division = c1.dividir(c2);
        System.out.printf("Multiplicacion: %s%n", division.convertir());
    }
}

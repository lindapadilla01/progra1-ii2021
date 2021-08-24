package variables;

import java.util.Scanner;

public class Transporte {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        //Leemos la cantidad de ruedas
        System.out.print("Ingrese las ruedas del medio de transporte: ");
        int ruedas = scanner.nextInt();

        //Clasificar e imprimir el transporte, dado las ruedas
        //Si las ruedas son 0, es verdadero carrito chocon
        boolean esCarritoChocon = ruedas == 0;
        System.out.println("Es carrito chocon: " + esCarritoChocon);
        //Si solo hay 1 rueda, es verdadero monociclo
        boolean esMonociclo = ruedas == 1;
        System.out.println("Es monociclo: " + esMonociclo);
        //Si solo hay 2 ruedas, es verdadero bicicleta
        boolean esBicicleta = ruedas == 2;
        System.out.println("Es bicicleta: " + esBicicleta);
        //Si solo hay 3 ruedas, es verdadero triciclo
        boolean esTriciclo = ruedas == 3;
        System.out.println("Es triciclo: " + esTriciclo);
        //Si solo hay 2 ruedas, es verdadero bicicleta
        boolean esAutomovil = ruedas == 4;
        System.out.println("Es automovil: " + esAutomovil);
        //Si hay mas de 5 ruedas, es verdadero camion
        boolean esCamion = ruedas >= 5;
        System.out.println("Es camion: " + esCamion);
    }
}

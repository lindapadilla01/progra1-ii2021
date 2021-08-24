package variables;

import java.util.Scanner;

public class VelocidadMain {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        //Lectura
        System.out.print("Distancia viajada (d): ");
        double distancia = scanner.nextDouble();
        System.out.print("Tiempo transcurrido (t): ");
        double tiempo = scanner.nextDouble();

        //Calcula de la formula
        Velocidad velocidad = new Velocidad();
        // double velocidad = distancia / tiempo;

        //Imprimir los resultados
        System.out.println("La velocidad (v) es: " + velocidad.obtenerVelocidad(distancia, tiempo));
    }
}

package variables.Mamiferos;

import java.util.Scanner;

public class MamiferosMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        //Obtener los datos
        System.out.print("El nombre del animal es: ");
        String nombre = scanner.nextLine(); 
        System.out.print("Tiene sangre fría: ");
        boolean esSangreFria = scanner.nextBoolean();
        System.out.print("Tiene glándulas mamarias: ");
        boolean tieneGlandulasMamarias = scanner.nextBoolean();
        System.out.print("Tiene pelo: ");
        boolean tienePelo = scanner.nextBoolean();
        System.out.print("Tiene vertebra: ");
        boolean esVertebrado = scanner.nextBoolean();

        //Procesar los datos
        boolean esMamifero = !esSangreFria && tieneGlandulasMamarias && tienePelo && esVertebrado;

        //Imprimir los resultados
        System.out.printf("El animal %s es mamífero: %b%n", nombre, esMamifero);
    }
}

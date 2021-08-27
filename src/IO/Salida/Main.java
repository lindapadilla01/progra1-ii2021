package IO.Salida;

/**
 * Clase para ver en mas detalle output
 * @version 27-08-2021
 * @author
 */
public class Main {
    public static void main (String [] args){
        int estudiantesEnZoom = 17;
        //No imprime una nueva linea
        System.out.print("La cantidad de estudiantes en Zoom hoy es: " );
        System.out.print(estudiantesEnZoom);

        System.out.println("\n-----");

        //Imprimir con una nueva linea
        System.out.println("La cantidad de estudiantes en Zoom hoy es: " + estudiantesEnZoom);

        System.out.println("-----");

        //Imprime con formato
        System.out.printf("La cantidad de estudiantes en Zoom hoy es: %+04d%n", estudiantesEnZoom);

        System.out.println("-----");
    }
}

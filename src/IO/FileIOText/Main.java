package IO.FileIOText;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Clase para ver archivos de texto y como leer y guardarlos
 */
public class Main{
    public static void main(String [] args) throws IOException{
        //Obtener un archivo
        Stream<String> file = Files.lines(Paths.get("./archivos/hola.txt"));
        //Pasamos a String
        String [] lines = file.toArray(String [] :: new);//Guarda cada linea separado. Se puede sacar cuantas lineas hay con lines.length
        String texto = String.join("\n", lines);
        file.close();

        //Imprimimos en entrada estandar el archivo
        System.out.println(texto);

        //NOTA: Siempre se abre y cierra un archivo
        //Decir el archivo a crear
        PrintWriter newFile = new PrintWriter("./archivos/copia.txt");
        //Pone el texto en el archivo
        newFile.print(texto);
        //Cierra el archivo
        newFile.close();
    }
}
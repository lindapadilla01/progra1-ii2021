package IO.FileIOCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String args[]) throws IOException{
        //Crea un objeto que permite leer archivos
        //NOTA: Pueden usar este tambien para FileIOText
        BufferedReader file = new BufferedReader(new FileReader("./archivos/estudiantes.csv"));
        //String texto =  file.toString();
        
        // String primeraLinea = file.readLine();
        // System.out.println(primeraLinea);

        //System.out.println(texto);
        //Crea el archivo
        PrintWriter newFile = new PrintWriter("./archivos/copia.csv");
        String row;
        //Copia cada linea del archivo viejo al nuevo
        while((row = file.readLine()) != null){
            String newRow = String.join(";", row.split(","));
            newFile.println(newRow);
        }
        //Se cierran los archivos usados
        file.close();
        newFile.close();
    }
}

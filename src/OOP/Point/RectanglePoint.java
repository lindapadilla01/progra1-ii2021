package OOP.Point;

/**
 * Guarda un rectangulo dado dos coordenadas (esquina superior izquierda y esquina inferior derecha)
 * @version 23-08-2021
 * @author Sivana Hamer
 */
public class RectanglePoint {
    //Atributo  
    Point superiorIzquierda; //Guarda la esquina superior izquierda
    Point inferiorDerecha; //Guarda la esquina inferior derecha

    //Constructor
    /**
     * Constructor de rectangulo con dos puntos
     * @param superiorIzquierda
     * @param inferiorDerecha
     */
    public RectanglePoint(Point superiorIzquierda, Point inferiorDerecha){
        this.superiorIzquierda = superiorIzquierda;
        this.inferiorDerecha = inferiorDerecha;
    }

    //Metodos
    /**
     * Obtiene la altura
     * @return La altura
     */
    public double getHeight(){
        //Obtenemos la esquina superior izquierda
        Point inferiorIzquierda = new Point(this.superiorIzquierda.getX(), this.inferiorDerecha.getY() );
        // Altura = diferencia entre la esquina superior izquierda con la inferior izquierda
        return this.superiorIzquierda.getDistance(inferiorIzquierda);
    }

    /**
     * Obtiene el ancho
     * @return El ancho
     */
    public double getWidth(){
        //Obtenemos la esquina superior derecha
        Point superiorDerecha = new Point(this.inferiorDerecha.getX(), this.superiorIzquierda.getY());
        // Ancho = diferencia entre la esquina superior izquierda y superior derecha
        return superiorDerecha.getDistance(this.superiorIzquierda);
    }

    /**
     * Imprimir la altura y ancho del rectangulo
     */
    public void imprimir(){
        System.out.println("Altura = " + this.getHeight());
        System.out.println("Ancho = " + this.getWidth());
    }
}

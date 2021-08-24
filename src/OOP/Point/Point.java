package OOP.Point;

/**
 * Punto de dos dimensiones
 * @version 23-08-2021
 * @author Sivana Hamer
 */
public class Point {
    //Atributos
    private double x;
    private double y;

    //Constructor
    /**
     * Constructor de punto con dos dimensiones
     * @param x La coordenada en x
     * @param y La coordenada en y
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Imprimir el punto con su coordenadas
     */
    public void imprimir(){
        System.out.println("X = " + this.x + " Y = " + this.y);
    }

    //Metodos
    /**
     * Getter de X
     * @return X del punto
     */
    public double getX(){
        return this.x;
    }

    //No le gusta a la profe mucho los setters >:v
    // public void setX(double x){
    //     this.x = x;
    // }

    /**
     * Getter de Y
     * @return Y del punto
     */
    public double getY(){
        return this.y;
    }

    /**
     * Obtiene la distancia entre dos puntos
     * @param p2 El punto al que se le saca la distancia de
     * @return La distancia entre this y p2
     */
    public double getDistance(Point p2){
        return Math.sqrt(Math.pow((p2.getX() - this.x), 2) + Math.pow((p2.getY() - this.y), 2));
    }
}

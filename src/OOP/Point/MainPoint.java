package OOP.Point;

/**
 * Main de los ejercicios de punto
 * @version 23-08-2021
 * @author Sivana Hamer
 */
public class MainPoint {
    public static void main(String [] args){
        Point p1 = new Point(2, 3);
        p1.imprimir();

        Point p2 = new Point(10, 1);
        p2.imprimir();

        double distance = p1.getDistance(p2);
        System.out.println(distance);


        RectanglePoint rp = new RectanglePoint(p1, p2);
        rp.imprimir();
    }
}

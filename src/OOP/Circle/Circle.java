package OOP.Circle;

/**
 * Represent a Circle
 * @author Sivana Hamer
 * @version 27-08-2021
 */
public class Circle {
    //Atributos
    private double radio; // El radio del circulo

    //Constructor
    /**
     * Constructor por defecto de circulo
     * @param radio El radio del circulo
     */
    public Circle(double radio){
        this.radio = radio;
    }

    //Metodos
    /**
     * Obtiene el area del circulo
     * @return El area
     */
    public double getArea(){
        double area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }

    /**
     * Obtiene el perimetro del circulo
     * @return El perimetro
     */
    public double getPerimeter(){
        return 2 * Math.PI * this.radio;
    }

    /**
     * Imprime los valores del circulo (radio, area y perimetro)
     */
    public void print(){
        System.out.printf("El radio del circulo es: %.2f%n", this.radio);
        System.out.printf("Area: %.2f\tPerimetro: %.2f%n", this.getArea(), getPerimeter());
    }
}

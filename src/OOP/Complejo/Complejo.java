package OOP.Complejo;

/**
 * Numero complejo
 * @author Sivana Hamer
 * @version 23-08-2021
 */
public class Complejo {
    //Atributos
    private double real; //Guarda la parte real
    private double imaginario; //Guarda la parte imaginaria

    //Constructor
    /**
     * Inicializa un numero complejo
     * @param real La parte real
     * @param imaginario La parte imaginaria
     */
    public Complejo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    /**
     * Obtiene la parte real del numero complejo
     * @return La parte real
     */
    public double getReal(){
        return this.real;
    }

    /**
     * Obtiene la parte imaginario del numero complejo
     * @return La parte imaginaria
     */
    public double getImaginario(){
        return this.imaginario;
    }

    //Metodos
    /**
     * Suma dos numeros complejos
     * @param c El otro numero complejo
     * @return El resultado de la suma
     */
    public Complejo sumar(Complejo otroComplejo){
        double a = this.real; 
        double b = this.imaginario;
        double c = otroComplejo.getReal();
        double d = otroComplejo.getImaginario();

        return new Complejo(a + c, b + d);
    }

    /**
     * Resta dos numeros complejos
     * @param c El otro numero a restar
     * @return La resultado de la resta
     */
    public Complejo restar(Complejo c){
        return new Complejo(this.real - c.getReal(), this.imaginario - c.getImaginario());
    }

    /**
     * Multiplica dos numeros complejos
     * @param c El otro numero complejo
     * @return El resultado de la multiplicacion
     */
    public Complejo multiplicar(Complejo otroComplejo){
        double a = this.real; 
        double b = this.imaginario;
        double c = otroComplejo.getReal();
        double d = otroComplejo.getImaginario();

        return new Complejo(a * c - b * d, b * c + a * d);
    }

    /**
     * Multiplica dos numeros complejos
     * @param c El otro numero complejo
     * @return El resultado de la multiplicacion
     */
    public Complejo dividir(Complejo otroComplejo){
        double a = this.real; 
        double b = this.imaginario;
        double c = otroComplejo.getReal();
        double d = otroComplejo.getImaginario();

        double real = (a * c + b * d) / (Math.pow(c, 2) + Math.pow(d, 2));
        double imaginaria = (b * c - a * d) / (Math.pow(c, 2) + Math.pow(d, 2));
        return new Complejo(real, imaginaria);
    }

    /**
     * Convertir un numero complejo a un string
     * @return El complejo como un string
     */
    public String convertir(){
        return String.format("%.2f + %.2fi", this.real, this.imaginario);
    }
}

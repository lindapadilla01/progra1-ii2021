package OOP.Dice;

/**
 * Main del dado
 * @author Sivana Hamer
 * @version 27-08-2021
 */
public class DiceMain {
    public static void main (String [] args){
        //Un d6
        Dice d6 = new Dice(6);
        System.out.println("The die has been rolled " + d6.roll());
        d6.imprimir();

        //Un d20
        Dice d20 = new Dice(20);
        System.out.println("The die has been rolled " + d20.roll());
        d20.imprimir();

        //Un d8
        Dice d8 = new Dice(8);
        System.out.println("The die has been rolled " + d8.roll());
        d8.imprimir();
    }
}

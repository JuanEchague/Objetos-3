package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Operacion {

    ////////////////////Atributes//////////////////////
    private double a;
    private double b;

    ///////////////////Builders////////////////////
    public Operacion(double a, double b) {
        this.a = a;
        this.b = b;
    }
    ////////////////////////

    public Operacion() {
    }
    /////////////Getters and Setters//////////////////

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    //////////////////////Metodos/////////////////////
    public void crearOperacion() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero: ");
        this.a = read.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        this.b = read.nextDouble();

    }

    public void sumar() {
        System.out.printf("%.2f mas %.2f es igual a %.2f\n", a, b, a + b);

    }

    public void restar() {
        System.out.printf("%.2f menos %.2f es igual a %.2f\n", a, b, a - b);

    }

    public void multiplicar() {
        if (b == 0) {
            System.out.println("Todo numero multiplicado por 0 es igual a 0");
        } else {
            System.out.printf("%.2f multiplicaddo por %.2f es igual a %.2f\n", a, b, a * b);
        }

    }

    public void dividir() {
        if (b == 0) {
            System.out.println("No se puede dividir por 0");

        } else {
            System.out.printf("%.2f dividido %.2f es igual a %.2f\n", a, b, a / b);
        }

    }
}

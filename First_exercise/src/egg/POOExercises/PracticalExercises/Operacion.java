package egg.POOExercises.PracticalExercises;

/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
*a) Método constructor con todos los atributos pasados por parámetro.
*b) Metodo constructor sin los atributos pasados por parámetro.
*c) Métodos get y set.
*d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
*en los atributos del objeto.
*e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
*f) Método restar(): calcular la resta de los números y devolver el resultado al main
*g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
*h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/

import java.util.Scanner;

public class Operacion {

    private double num1;
    private double num2;


    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
        crearOperacion();
    }

    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el 1 numero");
        setNum1(sc.nextDouble());
        System.out.println("Por favor ingrese el 2 numero");
        setNum2(sc.nextDouble());
    }


    //?Metodo para sumar los valores
    public double sumar() {

        return num1 + num2;

    }

    //?Metodo para restar los valores
    public double restar() {

        return num1 - num2;

    }

    //?Metodo para multiplicar los valores
    public double multiplicar() {

        if (num1 == 0 || num2 == 0) {
            System.out.println("--No es posible mulriplicar por 0--");
        }
        return num1 * num2;

    }

    //?Metodo para dividir los valores
    public double dividir() {

        double resultado;

        if (num1 == 0 || num2 == 0) {
            System.out.println("--No es posible dividir por 0--");
            resultado = 0;
        } else {
            resultado = num1 / num2;
        }

        return resultado;

    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}

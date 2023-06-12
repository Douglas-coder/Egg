package egg.POOExercises.PracticalExercises;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/

import java.util.Scanner;

public class Circunferencia {

    private int radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public Circunferencia() {
        crearCircunferencia();
    }

    public void crearCircunferencia() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        setRadio(sc.nextInt());

    }

    //Se debe de llamar calcularArea por buena practica
    public double area() {

        return Math.PI * Math.pow(radio, 2);

    }

    //Se debe de llamar calcularPerimetro por buena practica
    public double perimetro() {

        return 2 * Math.PI * radio;

    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}

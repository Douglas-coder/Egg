package egg.POOExercises.PracticalExercises;

/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        crearRectangulo();
        System.out.println("");
        dibujarRectangulo();
    }

    public void crearRectangulo() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese la base del rectangulo:");
        setBase(sc.nextInt());
        System.out.println("Por favor ingrese la altura del rectangulo");
        setAltura(sc.nextInt());

    }

    //?Metodo para hallar superficie
    public int superficie() {

        return base * altura;

    }

    //?Metodo para hallar perimetro
    public int perimetro() {

        return (base + altura) * 2;

    }

    //?Metodo para dibujar el rectangulo
    public void dibujarRectangulo() {

        for (int x = 1; x <= altura; x++) {
            for (int z = 1; z <= base; z++) {
                if (x == 1 || x == altura) {
                    System.out.print("[*]");
                } else if (z == 1 || z == base) {
                    System.out.print("[*]");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}

package POOExercises.BonusExercises;

/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
* Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
* Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
* Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
* Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
* Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
* Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
*/

import java.util.Scanner;

public class Raices {

    Scanner sc = new Scanner(System.in);
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Raices() {
        System.out.println("Por favor ingrese el valor de 'A': ");
        setA(sc.nextDouble());
        System.out.println("Por favor ingrese el valor de 'B': ");
        setB(sc.nextDouble());
        System.out.println("Por favor ingrese el valor de 'C': ");
        setC(sc.nextDouble());
        System.out.println();
        getCalcular();
        System.out.println();
    }

    //?Metodo para obtener discriminante
    //tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante() {

        return Math.pow(b, 2) - 4 * a * c;

    }

    //?Metodo para saber si tiene dos soluciones(Raices)
    //Numeros que den mayor a (0) a=1 b=-3 c=2
    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    //?Metodo para saber si tiene una unica soluvion(Raiz)
    //Numeros que den como resultado (0) a=1 b=2 c=1
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    //?Metodo para mostrar las dos posibles soluciones(Raices)
    //Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a)
    public void obtenerRaices() {
        System.out.println("El valor de la discriminante es: " + getDiscriminante());
        System.out.println();
        if (tieneRaices()) {
            double solucion1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            double solucion2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            /*System.out.println(
                    "RAICES\n" +
                            "SOLUCION 1 es igual " + solucion1 + '\n' +
                            "SOLUCION2 es igual " + solucion2 + '\n'
            );*/
            System.out.println("Raices: ");
            System.out.println("Solucion1 = " + solucion1);
            System.out.println("Solucion2 = " + solucion2);
        } else {
            System.out.println("No existen raices reales");
        }
    }

    //?Metodo para mostrar la solucion unica(Raices)
    //Formula ecuación 2o grado: (-b+√((b^2)-(4*a*c)))/(2*a)
    public void obtenerRaiz() {
        System.out.println("El valor de la discriminante es: " + getDiscriminante());
        if (tieneRaiz()) {
            double solucionunica = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println("Raiz: ");
            System.out.println("Solucion unica = " + solucionunica);
        } else {
            System.out.println("No tiene solucion unica");
        }
    }

    //?Metodo para mostrar una u otra solucion
    public void getCalcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene soluciones reales");
        }
    }

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}

package egg.ExtraExercises;

/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/

public class CambioDeValor {

    public static void main(String[] args) {

        //Inicializacion de variables con valores aleatorios
        int A = (int) (Math.random() * 20);
        int B = (int) (Math.random() * 20);
        int C = (int) (Math.random() * 20);
        int D = (int) (Math.random() * 20);
        int aux = A;

        //Impresion de los valores inicales por pantalla
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de B es: " + B);
        System.out.println("El valor de C es: " + C);
        System.out.println("El valor de D es: " + D);
        System.out.println("");

        //Creacion de subFuncion para cambio de valores
        cambioValor(A, B, C, D, aux);

    }

    //********** SubFuncion para cambiar los valores de las variables **********
    public static void cambioValor(int a, int b, int c, int d, int aux) {

        //Asignacion de los nuevos valores a cada variable
        a = b;
        b = c;
        c = d;
        d = aux;

        //Impresion de los valores intercambiados por pantalla
        System.out.println("El valor de A es: " + a);
        System.out.println("El valor de B es: " + b);
        System.out.println("El valor de C es: " + c);
        System.out.println("El valor de D es: " + d);

    }

}

package egg.ExtraExercises;

import java.util.Scanner;

/*Una obra social tiene tres clases de socios:

o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.

o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.

o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.

o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/

public class TipoDeSocios {

    public static void main(String[] args) {

        //Se generan las variables principales y el scanner
        Scanner sc = new Scanner(System.in);
        String tipoSocio;
        int valor;

        //Se le pide al usuario ingresar el tipo de socio
        System.out.println("Por favor indique que tipo de socio es: 'A', 'B' o 'C'");
        tipoSocio = sc.next();

        //Se valida que el tipo de socio solo corresponda al indicado al principio
        while (!tipoSocio.equals("a") && !tipoSocio.equals("b") && !tipoSocio.equals("c") && !tipoSocio.equals("A") && !tipoSocio.equals("B") && !tipoSocio.equals("C")) {
            //Se vuelve a pedir el tipo de socio en caso de ingresar un valor no valido
            System.out.println("Por favor ingrese un valor valido: 'A', 'B' o 'C'");
            tipoSocio = sc.next();
        }

        //Se pide el monto a pagar
        System.out.println("Por favor ingrese el valor de su tratamiento y le diremos su descuento");
        valor = sc.nextInt();

        //Mensaje para el usuario.
        System.out.println("Aguarde mientras calculamos su descuento");
        System.out.println("");

        //Se crea subFuncion para hacer calculos
        porcentajeDeDescuento(tipoSocio, valor);

    }

    private static void porcentajeDeDescuento(String tipoSocio, int valor) {

        //Se crea variable para devolver el valor final
        double monto;
        tipoSocio = tipoSocio.toLowerCase();

        //Se crea un switch(Segun) para hacer las operaciones segun el tipo de cliente y descuento
        switch (tipoSocio) {
            //Se crea cada uno de los caso con sus respectivos descuentos y se manda mensaje con la informacion necesaria para el usuario.
            case "a":
                monto = valor - (valor * 0.5);
                System.out.println("Sociedad tipo: '" + tipoSocio.toUpperCase() + "' el valor ingresado es: (" + valor + ") tiene un descuento del 50% y el valor a pagar es: " + monto);
                break;
            case "b":
                monto = valor - (valor * 0.35);
                System.out.println("Sociedad tipo: '" + tipoSocio.toUpperCase() + "' el valor ingresado es: (" + valor + ") tiene un descuento del 35% y el valor a pagar es: " + monto);
                break;
            case "c":
                monto = valor;
                System.out.println("Sociedad tipo: '" + tipoSocio.toUpperCase() + "' el valor ingresado es: (" + valor + ") y el valor a pagar es: " + monto);
                break;
        }
    }
}

package egg.POOExercises.Servicio;

import egg.POOExercises.BonusExercises.Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService extends Ahorcado {

    Scanner sc = new Scanner(System.in);

    public void crearJuego() {

        int contador = 0;

        System.out.println("Ingresa la palabra secreta:");
        String palabra = sc.nextLine();
        String[] palabraSecretaService = new String[palabra.length()];
        String[] palabraOcultaService = new String[palabra.length()];

        for (int x = 0; x < palabra.length(); x++) {
            contador++;
            palabraSecretaService[x] = palabra.substring(contador - 1, contador);
            setPalabraSecreta(palabraSecretaService);
            palabraOcultaService[x] = "_";
            setPalabraOculta(palabraOcultaService);
        }
        setLetrasEncontradas(0);
        setVidas(6);//2 piernas, 2 brazos, 1 cabeza, 1 torso

    }

    //?Metodo para validar si la letra se encuentra dentro de la palabra
    public boolean verificarLetra(String letra) {
        boolean letraEncontradaService = false;
        for (int x = 0; x < getPalabraSecreta().length; x++) {
            if (getPalabraSecreta()[x].equalsIgnoreCase(letra)) {
                letraEncontradaService = true;
                setLetrasEncontradas(getLetrasEncontradas() + 1);
                System.out.println(getLetrasEncontradas());
            }
        }
        return letraEncontradaService;
    }

    //?Metodo para buscar la palabra
    public void buscar() {
        String letra;
        crearJuego();
        System.out.println("La palabra contiene: " + getPalabraSecreta().length + " letras.");
        do {
            System.out.println(Arrays.toString(getPalabraOculta()));
            System.out.println("Ingrese una letra: ");
            letra = sc.next();
            if (verificarLetra(letra)) {
                System.out.println("La letra se encuentra en la palabra");
                actualizarPalabraSecreta(letra);
            } else {
                System.out.println("La letra no se encuentra en la palabra");
                reducirVida();
            }
        } while (!palabraCompleta() && getVidas() != 0);

        System.out.println("");
        System.out.print("La palabra secreta era: ");
        for (int x = 0; x < getPalabraSecreta().length; x++) {
            System.out.print(getPalabraSecreta()[x]);
        }
        System.out.println("\n" + "Haz ganado el ahorcado");


    }

    //?Metodo para verificar la condicion de victoria
    public boolean palabraCompleta() {
        return getLetrasEncontradas() == getPalabraSecreta().length;
    }

    //?Metodo para quitar vidas
    public void reducirVida() {
        setVidas(getVidas() - 1);
        System.out.println("Te quedan: " + getVidas() + " intentos.");
    }

    //?Metodo para reemplazar la palabraOculta por las letras ingresadas
    public void actualizarPalabraSecreta(String letra) {
        String[] palabraOcultaReemplazo = getPalabraOculta();
        for (int x = 0; x < getPalabraSecreta().length; x++) {
            if (letra.equalsIgnoreCase(getPalabraSecreta()[x])) {
                palabraOcultaReemplazo[x] = letra;
                setPalabraOculta(palabraOcultaReemplazo);
            }
        }
    }

}

package Colecciones.BonusExercises.ArrayNumeros;

import Colecciones.Main;

import java.util.ArrayList;
import java.util.List;

public class ArrayNumerosServices {

    List<ArrayNumeros> listaNumeros = new ArrayList<>();
    int numero;

    public ArrayNumeros ingresarNumeros() {
        System.out.println("Por favor ingrese un numero");
        numero = Main.sc.nextInt();

        return new ArrayNumeros(numero);
    }

    public void agregarNumero(ArrayNumeros n) {
        if (numero != 1 - 100) {
            listaNumeros.add(n);
        }
    }

    public void mostrarNumeros() {
        System.out.println("Los numeros ingresados son: " + '\n');
        for (ArrayNumeros aux : listaNumeros) {
            System.out.println(aux.toString());
        }
    }

    public void fabricarNumeros() {
        System.out.println("Ingrese [-99] para dejar de ingresar numeros");

        listaNumeros.add(new ArrayNumeros(5));
        listaNumeros.add(new ArrayNumeros(4));
        listaNumeros.add(new ArrayNumeros(12));
        listaNumeros.add(new ArrayNumeros(60));
        listaNumeros.add(new ArrayNumeros(3));

        do {

            for (int i = 0; i < 1; i++) {
                ArrayNumeros insertarNumeros = ingresarNumeros();
                agregarNumero(insertarNumeros);
            }

        } while (numero != 1 - 100);

    }

    public void sumaNumeros() {
        int total = 0;
        for (ArrayNumeros aux : listaNumeros) {
            total += aux.getNumero();
        }
        System.out.println(total);
        System.out.println();
    }

    public void promedioNumeros() {
        int suma = 0;
        for (ArrayNumeros aux : listaNumeros) {
            suma += aux.getNumero();
        }

        int promedio = suma / listaNumeros.size();

        System.out.println(promedio);
        System.out.println();
    }

}

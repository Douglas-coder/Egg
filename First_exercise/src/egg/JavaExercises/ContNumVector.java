package egg.JavaExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
// cuántos de 2 dígitos,etcétera(hasta 5 dígitos)


public class ContNumVector {
    public static void main(String[] args) {

        int[] vector = generarArray(10);

        Map<String, Integer> resultado = new HashMap<>();

        resultado.put("1 digito", 0);
        resultado.put("2 digitos", 0);
        resultado.put("3 digitos", 0);
        resultado.put("4 digitos", 0);
        resultado.put("5 digitos", 0);

        for (int i : vector) {
            System.out.print("[" + i + "]");
            int individualResult = calcularCantidadDeDigitos(i);
            if (individualResult == 1) {
                resultado.put("1 digito", resultado.get("1 digito") + 1);
            } else if (individualResult == 2) {
                resultado.put("2 digitos", resultado.get("2 digitos") + 1);
            } else if (individualResult == 3) {
                resultado.put("3 digitos", resultado.get("3 digitos") + 1);
            } else if (individualResult == 4) {
                resultado.put("4 digitos", resultado.get("4 digitos") + 1);
            } else if (individualResult == 5) {
                resultado.put("5 digitos", resultado.get("5 digitos") + 1);
            }
        }

        System.out.println("\n" + resultado);
    }

    private static int[] generarArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000) + 1;
        }
        return array;
    }

    private static int calcularCantidadDeDigitos(int numero) {
        return String.valueOf(numero).length();
    }
}
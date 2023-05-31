package egg.JavaExercises;

import java.util.Scanner;

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/

public class SecuenciaFDE {

    public static void main(String[] args) {

        //Se crean variables necesarias
        Scanner sc = new Scanner(System.in);
        int correct = 0;
        int incorrect = 0;

        System.out.println("Por favor ingrese las cadenas (maximo 5 caracteres), que inicie con 'X' y terminen con 'O'. Ingrese '&&&&&' para finalizar:");

        //Bloque de codigo que permite validar cuales cadenas son correctas e incorrectas.
        while (true) {

            String cadena = sc.nextLine();

            if (cadena.equalsIgnoreCase("&&&&&")) {
                break;
            }

            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                correct++;
            } else {
                incorrect++;
            }

        }

        //Se imprime la informacion final por pantalla para indicar resultados
        System.out.println("Informe");
        System.out.println("Cadenas correctas: " + correct);
        System.out.println("Cadenas incorrectas: " + incorrect);

    }

}

package egg.JavaExample;

import java.util.Scanner;

public class CambioVocal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text;

        do {
            System.out.println("Por favor ingrese texto a codificar que termine en '.':");
            text = sc.nextLine();
        } while (!text.substring(text.length() - 1, text.length()).equals("."));

        codificar(text);

        System.out.println(codificar(text));

    }

    public static String codificar(String text) {

        String codificado = "";

        text = text.toLowerCase();

        for (int x = 0; x < text.length(); x++) {

            switch (text.charAt(x)) {
                case 'a':
                    codificado += ("@");
                    break;
                case 'e':
                    codificado += ("#");
                    break;
                case 'i':
                    codificado += ("$");
                    break;
                case 'o':
                    codificado += ("%");
                    break;
                case 'u':
                    codificado += ("*");
                    break;
                default:
                    codificado += (text.charAt(x));
                    break;
            }
        }

        return codificado;
    }

}

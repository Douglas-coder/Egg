package egg.POOExercises.PracticalExercises;

/*
*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
*String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
*a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
*b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
*c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
*d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Cadena {

    Scanner sc = new Scanner(System.in);
    private String frase;
    private int longitud;

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {

        /*System.out.println("Por favor ingrese una frase o palabra:");
        setFrase(sc.nextLine());*/
        setFrase("Estamos programando con POO");
        System.out.println(frase);
        setLongitud(frase.length());
        System.out.println("La longitud de la frase o palabra es: " + longitud);

    }

    //?Metodo mostrar vocales
    public int mostrarVocales() {

        int cont = 0;

        for (int x = 0; x < frase.length(); x++) {
            if (frase.charAt(x) == 'a' || frase.charAt(x) == 'e' || frase.charAt(x) == 'i' || frase.charAt(x) == 'o' || frase.charAt(x) == 'u'
                    || frase.charAt(x) == 'A' || frase.charAt(x) == 'E' || frase.charAt(x) == 'I' || frase.charAt(x) == 'O' || frase.charAt(x) == 'U') {
                cont++;
            }
        }

        return cont;

    }

    //?Metodo invertir frase
    public String invertirFrase() {

        String invertido = "";

        for (int x = frase.length() - 1; x >= 0; x--) {
            invertido += frase.charAt(x);
        }

        return invertido;

    }

    //?Metodo veces repetido
    public int vecesRepetido() {

        int cont = 0;

        System.out.println("Por favor indique que letra desea contabilizar?");
        String letra = sc.next();
        char letraChar = letra.charAt(0);

        for (int x = 0; x < frase.length(); x++) {

            if (frase.charAt(x) == letraChar){
                cont++;
            }

        }

        return cont;

    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}

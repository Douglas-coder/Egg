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
*e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
*f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
*g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/

import java.util.Scanner;

public class Cadena {

    Scanner sc = new Scanner(System.in);
    private String frase;
    private int longitud;
    private String frase2;
    private int longitud2;
    private String convinadas;

    public Cadena(String frase, int longitud, String frase2, int longitud2, String convinadas) {
        this.frase = frase;
        this.longitud = longitud;
        this.frase2 = frase2;
        this.longitud2 = longitud2;
        this.convinadas = convinadas;
    }

    public Cadena() {

        /*System.out.println("Por favor ingrese una frase o palabra:");
        setFrase(sc.nextLine());*/
        setFrase("esto es una prueba");

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

            if (frase.charAt(x) == letraChar) {
                cont++;
            }

        }

        return cont;

    }

    //?Metodo para comprara la longitud de las frases
    public String getCompararLongitud() {

        setFrase2("para unir dos frases distintas");
        setLongitud2(frase2.length());
        String comparar;

        if (longitud > longitud2) {
            comparar = "La frase 1 tiene mayor longitud que la frase 2";
        } else if (longitud < longitud2) {
            comparar = "La frase 2 tiene mayor longitud que la frase 1";
        } else {
            comparar = "Las frases tienen la misma longitud";
        }

        return comparar;

    }

    //?Metodo para unir dos frases
    public String getUnirFrases() {

        return convinadas = frase + " " + frase2;
    }

    //?Metodo para reemplzaar la "a"
    public String getReemplazar() {

        String reemplazar = "";

        System.out.println("Por favor indique un caracter.");
        String caracter = sc.next();

        for (int x = 0; x < convinadas.length(); x++) {

            switch (convinadas.charAt(x)) {
                case 'a':
                    reemplazar += (caracter);
                    break;
                default:
                    reemplazar += (convinadas.charAt(x));
            }

        }

        return reemplazar;

    }

    //?Metodo para validar si la letra esta dentro de la frase
    public boolean getContiene() {

        boolean contiene = false;

        System.out.println("Por favor indique que letra desea validar");
        String letra = sc.next();
        letra.toLowerCase();
        char letraChar = letra.charAt(0);

        for (int x = 0; x < convinadas.length(); x++) {
            if (convinadas.charAt(x) == letraChar) {
                contiene = true;
            }
        }

        return contiene;

    }

    @Override
    public String toString() {
        return  '\n' +"La palabra o frase contiene: " + mostrarVocales() + " vocales." + '\n' +
                "Palabra o frase invertida: " + '\n' + invertirFrase() + '\n' +
                "La letra seleccionada se encuentra repetida: "  + vecesRepetido() + " veces." + '\n' +
                getCompararLongitud() + '\n' +
                "La frase 1 tiene: " + longitud + '\n' +
                "La frase 2 tiene: " + longitud2 + '\n' +
                getUnirFrases() + '\n' +
                getReemplazar() + '\n' +
                getContiene() + '\n';
    }

    public String getFrase2() {
        return frase2;
    }

    public void setFrase2(String frase2) {
        this.frase2 = frase2;
    }

    public int getLongitud2() {
        return longitud2;
    }

    public void setLongitud2(int longitud2) {
        this.longitud2 = longitud2;
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

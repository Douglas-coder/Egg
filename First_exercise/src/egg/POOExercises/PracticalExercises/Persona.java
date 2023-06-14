package egg.POOExercises.PracticalExercises;

/*
*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
* Un constructor por defecto.
* Un constructor con todos los atributos como parámetro.
* Métodos getters y setters de cada atributo.
* Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
* Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
*Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
*/

import java.util.Random;
import java.util.Scanner;

public class Persona {

    Scanner sc = new Scanner(System.in);

    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;

    public Persona(Scanner sc, String nombre, int edad, String sexo, int peso, double altura) {
        this.sc = sc;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }

    //*Metodo crear persona
    public void crearPersona() {

        String orientacionSexual;
        Random random = new Random();

        /*System.out.println("Por favor ingrese su nombre:");
        setNombre(sc.nextLine());*/
        setNombre("John Doe");
        /*System.out.println("Por favor ingrese su edad:");
        setEdad(sc.nextInt());*/
        setEdad(random.nextInt(50));
        System.out.println("Por favor indique su sexo");
        System.out.println("H- Hombre");
        System.out.println("M- Mujer");
        System.out.println("O- Otro");
        orientacionSexual = sc.next();
        orientacionSexual = orientacionSexual.toUpperCase();
        do {
            if (orientacionSexual.equals("H") || orientacionSexual.equals("M") || orientacionSexual.equals("O")) {
                setSexo(orientacionSexual);
            } else {
                System.out.println("La opcion seleccionada no es valida, vuelve a intentar:");
                orientacionSexual = sc.next();
                orientacionSexual = orientacionSexual.toUpperCase();
            }
        } while (sexo != orientacionSexual);
        /*System.out.println("Por favor ingrese su peso:");
        setPeso(sc.nextInt());*/
        peso = random.nextInt(90 - 50 + 1) + 50;
        System.out.println("Por favor ingrese su altura en mt2 (ejemplo 1.70):");
        setAltura(sc.nextDouble());

    }

    //?Metodo mostrar datos del arrayList
    public String mostrarDatos() {

        String mostrar = "";

        mostrar += "Nombre: " + this.nombre + "\n";
        mostrar += "Sexo: " + this.sexo + "\n";
        mostrar += "Usted esta en su peso ideal? " + calcularIMC() + "\n";
        mostrar += "Este es tu peso " + this.peso + "\n";
        mostrar += "Este es tu altura " + this.altura + "\n";
        mostrar += "Usted es mayor de edad? " + esMayorDeEdad() + "\n";

        return mostrar;

    }

    //?Metodo calcular IMC
    public double calcularIMC() {

        double imc;
        double resultado = (peso / Math.pow(altura, 2));

        if (resultado < 20) {
            imc = -1;
        } else if (resultado >= 20 && resultado <= 25) {
            imc = 0;
        } else {
            imc = 1;
        }

        return imc;

    }

    //?Metodo Mayor de edad
    public boolean esMayorDeEdad() {

        boolean mayorDeEdad;

        if (edad >= 18) {
            mayorDeEdad = true;
        } else {
            mayorDeEdad = false;
        }

        return mayorDeEdad;

    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

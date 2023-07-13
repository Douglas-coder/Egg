package egg.POOExercises.PracticalExercises;

/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Calendario {

    Scanner sc = new Scanner(System.in);
    private int dia;
    private int mes;
    private int anio;
    private int edad;

    public Calendario(int dia, int mes, int anio, int edad) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.edad = edad;
    }

    public Calendario() {
        ingresarFecha();
        System.out.println();
        mostrarInformacion();
        System.out.println();
    }

    public void ingresarFecha() {

        System.out.println("Ingresa tu fecha de nacimiento:");
        System.out.println("Día: ");
        setDia(sc.nextInt());
        System.out.println("Mes: ");
        setMes(sc.nextInt() - 1); //Se resta 1 porque los meses en java empiezan en 0
        System.out.println("Año: ");
        setAnio(sc.nextInt() - 1900); //Se reesta 1900 porque los años en java empiezan en 1900

    }

    public void getCalcularEdad() {

        Date fechaNacimiento = new Date(anio, mes, dia);
        SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
        String formaFecha = forma.format(fechaNacimiento);
        Date fechaActualizada = new Date();
        long difEnMilisegundos = fechaActualizada.getTime() - fechaNacimiento.getTime();
        long difEnAnios = difEnMilisegundos / (1000 * 60 * 60 * 24 * 365L);
        setEdad((int) difEnAnios);
        System.out.println("Su fecha de nacimiento es: " + formaFecha);
        System.out.println("Su edad es: " + difEnAnios + " años");

    }

    public void getMenorQue() {

        boolean menor = false;
        int edad1;
        System.out.println("Ingrese su edad: ");
        edad1 = sc.nextInt();

        if (edad1 < edad) {
            menor = true;
        }

        System.out.println("La edad ingresada es menor: " + menor);

    }

    public void mostrarInformacion() {

        //Creacion Objeto Date
        Date fecha = new Date(anio, mes, dia);
        //Creacion objeto SimpleDateFormat para darle un formato generico a la fecha
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //Se usa el metodo format para mostrar la fecha como quedo en el objeto SimpleDateFormat
        String fechaFormateeada = formato.format(fecha);
        //Se muestran las fechas en ambas formas
        System.out.println("La fecha ingresada es: " + fecha);
        System.out.println("La fecha ingresada es: " + fechaFormateeada);
        Date fechaActual = new Date();
        long diferenciaEnMilisegundos = fechaActual.getTime() - fecha.getTime();
        long diferenciaEnAnios = diferenciaEnMilisegundos / (1000 * 60 * 60 * 24 * 365L);
        System.out.println("La diferencia en años entre la fecha ingresada y la fecha actual es: " + diferenciaEnAnios);

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}

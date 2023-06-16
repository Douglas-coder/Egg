package egg.POOExercises.BonusExercises;

import java.util.Scanner;

public class Vehiculo {

    Scanner sc = new Scanner(System.in);
    private String marca;
    private String modelo;
    private int anno;
    private int selectorTipo;
    private String tipo;
    private int velocidad;

    public Vehiculo(Scanner sc, String marca, String modelo, int anno, int selectorTipo, String tipo, int velocidad) {
        this.sc = sc;
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.selectorTipo = selectorTipo;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public Vehiculo() {

        System.out.println("Por favor seleccione el tipo de vehiculo: ");
        System.out.println("1- Automivil");
        System.out.println("2- Motocicleta");
        System.out.println("3- Bicicleta");
        selectorTipo = sc.nextInt();
        System.out.println("");

        switch (selectorTipo) {
            case 1://?Automovil
                setTipo("Automovil");
                seleccionarAutomovil();
                break;
            case 2://?Motocicleta
                setTipo("Motocicleta");
                seleccionarMotocicleta();
                break;
            case 3://?Bicicleta
                setTipo("Bicicleta");
                seleccionarBicicleta();
                break;
        }

        moverse();

    }

    //?Metodo seleccionar marca, modelo & año del automovil
    public void seleccionarAutomovil() {

        int selectorAutomovil;

        System.out.println("Por favor seleccione la marca");
        System.out.println("1- Toyota");
        System.out.println("2- Ford");
        System.out.println("3- Tesla");
        selectorAutomovil = sc.nextInt();

        switch (selectorAutomovil) {
            case 1://*Toyota
                setMarca("Toyota");
                setModelo("Corolla");
                setAnno(2023);
                break;
            case 2://*Ford
                setMarca("Ford");
                setModelo("F Series");
                setAnno(2023);
                break;
            case 3://*Tesla
                setMarca("Tesla");
                setModelo("Model Y");
                setAnno(2020);
                break;
        }

        System.out.println("");

    }

    //?Metodo seleccionar marca, modelo & año de la motocicleta
    public void seleccionarMotocicleta() {

        int selectorMotocicleta;

        System.out.println("Por favor seleccione la marca");
        System.out.println("1- Ducati");
        System.out.println("2- Harley Davidson");
        System.out.println("3- Yamaha");
        selectorMotocicleta = sc.nextInt();

        switch (selectorMotocicleta) {
            case 1://*Ducati
                setMarca("Ducati");
                setModelo("Diavel 1260 S");
                setAnno(2021);
                break;
            case 2://*Harley Davidson
                setMarca("Harley Davidson");
                setModelo("Sportster Nightster");
                setAnno(2022);
                break;
            case 3://*Yamaha
                setMarca("Yamaha");
                setModelo("R15");
                setAnno(2023);
                break;
        }

        System.out.println("");

    }

    //?Metodo seleccionar marca, modelo & año de la bicicleta
    public void seleccionarBicicleta() {

        int selectorMotocicleta;

        System.out.println("Por favor seleccione la marca");
        System.out.println("1- Scott");
        System.out.println("2- Trek");
        System.out.println("3- Specialized");
        selectorMotocicleta = sc.nextInt();

        switch (selectorMotocicleta) {
            case 1://*Ducati
                setMarca("Scott");
                setModelo("Spark RC");
                setAnno(2022);
                break;
            case 2://*Harley Davidson
                setMarca("Trek");
                setModelo("Madone SLR 9 AXS Gen 7");
                setAnno(2022);
                break;
            case 3://*Yamaha
                setMarca("Specialized");
                setModelo("Chisel Comp");
                setAnno(2023);
                break;
        }

        System.out.println("");

    }

    //?Metodo mostrar datos
    public String mostrarDatos() {

        String mostrar = "";
        int tiempo = 5;
        int tiempo1 = 10;
        int tiempo2 = 60;

        mostrar += "Tipo: " + this.tipo + "\n";
        mostrar += "Marca: " + this.marca + "\n";
        mostrar += "Modelo: " + this.modelo + "\n";
        mostrar += "Año: " + this.anno + "\n";
        mostrar += "El vehiculo recorrio: \n";
        mostrar += "» " + tiempo * this.velocidad + " metros en ◷ 5 segundos \n";
        mostrar += "» " + tiempo1 * this.velocidad + " metros en ◷ 10 segundos \n";
        mostrar += "» " + tiempo2 * this.velocidad + " metros en ◷ 1 minuto \n";

        return mostrar;

    }

    //?Metodo moverse
    public void moverse() {

        if (selectorTipo == 1) {
            this.velocidad = 3;
        } else if (selectorTipo == 2) {
            this.velocidad = 2;
        } else {
            this.velocidad = 1;
        }
    }

    //!Metodo frenar
    public int getFrenar() {

        int tiempo = 60 * 5;
        int distancia;

        if (selectorTipo == 1 || selectorTipo == 2) {
            distancia = (this.velocidad * tiempo) * 2;
        } else {
            distancia = this.velocidad * tiempo;
        }

        return distancia;

    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getSelectorTipo() {
        return selectorTipo;
    }

    public void setSelectorTipo(int selectorTipo) {
        this.selectorTipo = selectorTipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}

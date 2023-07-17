package egg.POOExercises.Retos.Vehiculos;

import egg.POOExercises.Menu.MenuChallenge;

import java.util.Scanner;

public class Vehiculo {

    private static Scanner sc = new Scanner(System.in);
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

        int opc;

        showVehiculoOptions();
        opc = selectOption();
        System.out.println();
        options(opc);

        while (opc == 4) {
            MenuChallenge menuChallenge = new MenuChallenge();
            menuChallenge.challengeMenu();
        }

        moverse();

    }

    private static void showVehiculoOptions() {
        System.out.println(
                "1 ⇒ Automovil 🚗 " + " | 2 ⇒ Motocicleta 🛵" + '\n' +
                        "3 ⇒ Bicicleta 🚲 " + " | 4 ⇒ Menu retos" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Seleccione una opción");
        return sc.nextInt();
    }

    private void options(int opc) {
        switch (opc) {
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
            case 4:
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

    //?Metodo seleccionar marca, modelo & año del automovil
    public void seleccionarAutomovil() {

        int selectorAutomovil;

        System.out.println(
                "1 ⇒ Toyota " + " | 2 ⇒ Ford" + '\n' +
                        "3 ⇒ Tesla  " + '\n'
        );

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

    }

    //?Metodo seleccionar marca, modelo & año de la motocicleta
    public void seleccionarMotocicleta() {

        int selectorMotocicleta;

        System.out.println(
                "1 ⇒ Ducati " + " | 2 ⇒ Harley Davidson" + '\n' +
                        "3 ⇒ Yamaha " + '\n'
        );

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

    }

    //?Metodo seleccionar marca, modelo & año de la bicicleta
    public void seleccionarBicicleta() {

        int selectorMotocicleta;

        System.out.println(
                "1 ⇒ Scott " + " | 2 ⇒ Trek" + '\n' +
                        "3 ⇒ Specialized " + '\n'
        );

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

    }

    //?Metodo mostrar datos
    @Override
    public String toString() {

        int tiempo = 5;
        int tiempo1 = 10;
        int tiempo2 = 60;

        return "Tipo: " + this.tipo + '\n' +
                "Marca: " + this.marca + '\n' +
                "Modelo: " + this.modelo + '\n' +
                "Año: " + this.anno + '\n' +
                "El vehiculo recorrio: " + '\n' +
                "» " + tiempo * this.velocidad + " metros en ◷ 5 segundos" + '\n' +
                "» " + tiempo1 * this.velocidad + " metros en ◷ 10 segundos" + '\n' +
                "» " + tiempo2 * this.velocidad + " metros en ◷ 1 minuto" + '\n';
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

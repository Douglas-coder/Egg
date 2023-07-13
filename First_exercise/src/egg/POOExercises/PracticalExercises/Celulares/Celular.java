package egg.POOExercises.PracticalExercises.Celulares;

/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
* Un constructor por defecto.
* Un constructor con todos los atributos como parámetro.
* Métodos getters y setters de cada atributo.
* Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
*/

import java.util.Arrays;
import java.util.Scanner;

public class Celular {

    Scanner sc = new Scanner(System.in);
    private int selecMarca;
    private String marca;
    private int precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo = new int[7];

    public Celular(int selecMarca, String marca, int precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.selecMarca = selecMarca;
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public Celular() {
    }

    //?Metodo para crear los celulares
    public void getCargarCelular() {

        System.out.println("Por favor seleccione la marca del celular:");
        System.out.println("1- Apple");
        System.out.println("2- Xiaomi");
        System.out.println("3- Samsung");
        setSelecMarca(sc.nextInt());

        switch (selecMarca) {
            case 1:
                setMarca("Apple");
                setModelo("iPhone 14 Pro Max");
                setPrecio(7549);
                setMemoriaRam(6);
                setAlmacenamiento(256);
                break;
            case 2:
                setMarca("Xiaomi");
                setModelo("Xiaomi Mi 11 Lite");
                setPrecio(1175);
                setMemoriaRam(6);
                setAlmacenamiento(128);
                break;
            case 3:
                setMarca("Samsung");
                setModelo("Galaxy A54 5G");
                setPrecio(1498);
                setMemoriaRam(6);
                setAlmacenamiento(128);
                break;
        }

        getIngresarCodigo();

        System.out.println("");

    }

    //?Metodo para ingresar el codigo del celular
    public void getIngresarCodigo() {
        for (int x = 0; x < codigo.length; x++) {
            System.out.println("Por favor ingrese el digito #" + (x + 1));
            codigo[x] = sc.nextInt();
        }
    }

    //?toString() Para mostrar los valores de los atributos
    @Override
    public String toString() {
        return "Marca: " + marca + '\n' +
                "Modelo: " + modelo + '\n' +
                "Memoria Ram: " + memoriaRam + "GB" + '\n' +
                "Almacenamiento: " + almacenamiento + "GB" + '\n' +
                "Precio: $" + precio + '\n' +
                "Codigo: " + Arrays.toString(Arrays.copyOf(codigo, 7)) + '\n';
    }

    public int getSelecMarca() {
        return selecMarca;
    }

    public void setSelecMarca(int selecMarca) {
        this.selecMarca = selecMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
}

package egg.POOExercises.PracticalExercises.Banco;

/*
*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
*numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
*a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
*b) Agregar los métodos getters y setters correspondientes
*c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
*d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
*e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
*f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
*g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
*h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
*/

import java.util.Scanner;

public class CuentaBancaria {

    Scanner sc = new Scanner(System.in);

    private int numeroCuenta;
    private int DNICliente;
    private int saldoActual = 0;

    public CuentaBancaria(int numeroCuenta, int DNICliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNICliente = DNICliente;
        this.saldoActual = saldoActual;
    }

    public CuentaBancaria() {

        crearCuenta();

        /*int continuar = 1;

        while (continuar == 1) {

            System.out.println("Por favor indique que desea realizar");
            System.out.println("1- Ingresar monto");
            System.out.println("2- Retirar monto");
            System.out.println("3- Extracion rapida");
            System.out.println("4- Consultar saldo");
            System.out.println("5- Consultar datos");
            int menu = sc.nextInt();
            System.out.println("");

            switch (menu) {
                case 1:
                    ingresarSaldo();
                    break;
                case 2:
                    retirarSaldo();
                    break;
                case 3:
                    extraccionRapida();
                    break;
                case 4:
                    consultarSaldo();
                    System.out.println("");
                    continue;
                case 5:
                    consultarDatos();
                    break;
                default:
                    System.out.println("Opcion erronea");
            }

            System.out.println("");
            System.out.println("Desea consultar o realizar otra accion? (1)");
            System.out.println("Salir (0)");
            continuar = sc.nextInt();

        }*/

    }

    public void crearCuenta() {

        /*System.out.println("Por favor ingrese el numero de cuenta");
        setNumeroCuenta(sc.nextInt());*/
        setNumeroCuenta((int) (Math.random()*1000000000));
        /*System.out.println("Por favor ingrese su DNI");
        setDNICliente(sc.nextInt());*/
        setDNICliente(1037639137);

    }

    //*Metodo ingresar saldo
    public void ingresarSaldo() {

        System.out.println("Por favor indique el monto a ingresar:");
        double ingreso = sc.nextDouble();

        setSaldoActual((int) (saldoActual + ingreso));
        System.out.println();

    }

    //!Metodo retirar saldo
    public void retirarSaldo() {

        System.out.println("Ingrese el monto a retirar:");
        double retiro = sc.nextDouble();

        if (retiro > saldoActual) {
            setSaldoActual(0);
        } else {
            setSaldoActual((int) (saldoActual - retiro));
        }
        System.out.println();

    }

    //!Metodo extraccion rapida
    public void extraccionRapida() {

        double saldoAl20 = (saldoActual * 0.2);
        int confirmar;

        System.out.println("El 20% de su saldo actual es: " + saldoAl20 + " desea retirar este saldo?");
        System.out.println("1- Si");
        System.out.println("2- No");

        confirmar = sc.nextInt();

        if (confirmar == 1) {

            setSaldoActual((int) (saldoActual - saldoAl20));

        } else {
            System.out.println("Gracias.");
        }
        System.out.println();

    }

    //?Metodo consultar saldo
    public void consultarSaldo() {

        System.out.println("Su saldo es: " + saldoActual);
        System.out.println();

    }

    //?Metodo consultar datos
    public void consultarDatos() {

        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("DNI usuario: " + DNICliente);
        System.out.println();

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(int DNICliente) {
        this.DNICliente = DNICliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
}

package egg.POOExercises.Retos.Vehiculos.Servicios;

import egg.POOExercises.Retos.Vehiculos.Vehiculo;

import java.util.ArrayList;

public class VehiculoService {

    //Array list para guardar los 3 vehiculos
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    //Variables para guardar los ultimos datos necesarios
    private static int mayor = 0;
    private static String tipo = "";

    public VehiculoService() {
        crearVehiculo();
        System.out.println();
        mostrarVehiculo();
        calcularVehiculo();
    }

    public static void crearVehiculo() {

        //Ciclo for para Crear los 3 vehiculos
        for (int x = 0; x < 3; x++) {
            System.out.println("Vehiculo #" + (x + 1));
            Vehiculo vehiculo = new Vehiculo();
            //Se añade los valores al ArrayList
            vehiculos.add(vehiculo);
        }

    }

    public static void mostrarVehiculo() {

        //Mostramos por pantalla los datos de los vehiculos creados
        for (int x = 0; x < vehiculos.size(); x++) {
            System.out.println(vehiculos.get(x).toString());
        }

    }

    public static void calcularVehiculo() {

        //Ciclo for para hallar el vehiuculo que mas avanzo despues de frenar
        for (int x = 0; x < vehiculos.size(); x++) {
            System.out.println("El vehiculo #" + (x + 1) + " Recorrio " + vehiculos.get(x).getFrenar() + " metros despues de ◶ 5 minutos");
            if (vehiculos.get(x).getFrenar() > mayor) {
                mayor = vehiculos.get(x).getFrenar();
                tipo = vehiculos.get(x).getTipo();
            }
        }

        System.out.println();

    }

}

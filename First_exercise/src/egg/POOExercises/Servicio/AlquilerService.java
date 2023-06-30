package egg.POOExercises.Servicio;

import egg.POOExercises.Sentidad.Peliculas.Alquiler;
import egg.POOExercises.Sentidad.Peliculas.Peliculas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class AlquilerService extends Alquiler {

    Scanner sc = new Scanner(System.in);

    //?Metodo crear alquiler
    public void crearAlquiler() {

        System.out.println("Ingrese el nombre de la pelicula a alquilar:");
        setPeliculaAlquilada(sc.nextLine());

        System.out.println("Ingrese la fecha inicio del alquiler:");
        System.out.println("Dia:");
        int diaI = sc.nextInt();
        System.out.println("Mes:");
        int mesI = sc.nextInt();
        System.out.println("Año:");
        int anioI = sc.nextInt();
        setFechaInicio(LocalDate.of(anioI, mesI, diaI));

        System.out.println("Ingrese la fecha final del alquiler:");
        System.out.println("Dia:");
        int diaF = sc.nextInt();
        System.out.println("Mes:");
        int mesF = sc.nextInt();
        System.out.println("Año:");
        int anioF = sc.nextInt();
        setFechaFin(LocalDate.of(anioF, mesF, diaF));

    }

    //?Metodo para comprobar los titulos de las peliculas a alquilar
    public boolean ComprobarPelicula(ArrayList<Peliculas> peli) {

        boolean esta = false;

        for (int x = 0; x < peli.size(); x++) {
            if (Objects.equals(peli.get(x).getTitulo(), getPeliculaAlquilada())) {
                esta = true;
            }
        }

        return esta;

    }

    //?Metodo para calcular el precio del alquiler
    public void precioAlquiler(ArrayList<Alquiler> alquiler) {

        long diferencia = DAYS.between(getFechaInicio(), getFechaFin());

        System.out.println("Usted ha alquilado la pelicula por: " + diferencia + " días");

        if (diferencia <= 3) {
            setPrecio(10);
        } else {
            int diaExtra = (int) (diferencia - 3);
            setPrecio(diaExtra * 0.1);
        }

    }

    //?Metodo para mostrar datos de pelicula alquilada
    @Override
    public String toString() {
        return "Titulo: " + getPeliculaAlquilada() + '\n' +
                "Fecha inicio: " + getFechaInicio() + '\n' +
                "Fecha final: " + getFechaFin() + '\n' +
                "Precio: " + getPrecio() + '\n';
    }

}

package egg.POOExercises.Retos.Peliculas.Menu;

import egg.POOExercises.MainProgram.RefactorMain;
import egg.POOExercises.Retos.Peliculas.CrearPeliculas;
import egg.POOExercises.Retos.Peliculas.Entidades.Peliculas;

import java.util.Objects;
import java.util.Scanner;

public class MenuBuscarPelicula {

    public void searchMenu() {

        int opc;

        do {
            showSearchOptions();
            opc = selectOption();
            System.out.println();
            searchOptions(opc);
        } while (opc != 4);

    }

    private static void showSearchOptions() {
        System.out.println(
                "1 ⇒ Por titulo   " + " | 2 ⇒ Por genero" + '\n' +
                        "3 ⇒ Por alquiler " + " | 4 ⇒ Menu peliculas" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Seleccione una opción");
        return RefactorMain.sc.nextInt();
    }

    private void searchOptions(int opc) {
        Scanner buscar = new Scanner(System.in);
        switch (opc) {
            case 1:
                System.out.println("Ingrese el titulo de la pelicula que desea buscar");
                String tituloPelicula = buscar.nextLine();
                System.out.println();

                for (int x = 0; x < CrearPeliculas.listaPeliculas.size(); x++) {
                    if ((Objects.equals(CrearPeliculas.listaPeliculas.get(x).getTitulo(), tituloPelicula))) {
                        System.out.println("La pelicula si se encuentra.");
                    } else {
                        System.out.println("La pelicula no se encuentra.");
                    }
                }
                System.out.println();
                break;
            case 2:
                System.out.println("Ingrese el genero de la pelicula que desea buscar");
                String generoPelicula = buscar.nextLine();
                System.out.println();

                for (int x = 0; x < CrearPeliculas.listaPeliculas.size(); x++) {
                    if ((Objects.equals(CrearPeliculas.listaPeliculas.get(x).getGenero(), generoPelicula))) {
                        System.out.println("Titulo: " + CrearPeliculas.listaPeliculas.get(x).getTitulo());
                    } else {
                        System.out.println("La pelicula no se encuentra.");
                    }
                }
                System.out.println();
                break;
            case 3:
                System.out.println("Por favor ingrese el titulo de la pelicula");
                String pelicula = buscar.nextLine();
                System.out.println();

                for (int x = 0; x < CrearPeliculas.listaAlquiler.size(); x++) {
                    if ((Objects.equals(CrearPeliculas.listaAlquiler.get(x).getPeliculaAlquilada(), pelicula))) {
                        System.out.println(CrearPeliculas.listaAlquiler.get(x).toString());
                    } else {
                        System.out.println("La pelicula ingresada no se encuentra alquilada");
                    }
                }
                System.out.println();
                break;
            case 4:
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}

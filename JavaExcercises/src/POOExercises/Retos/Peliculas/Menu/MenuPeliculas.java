package POOExercises.Retos.Peliculas.Menu;

import POOExercises.MainProgram.RefactorMain;
import POOExercises.Retos.Peliculas.CrearPeliculas;
import POOExercises.Retos.Peliculas.Entidades.Alquiler;
import POOExercises.Retos.Peliculas.Entidades.Peliculas;
import POOExercises.Retos.Peliculas.Servicios.AlquilerService;
import POOExercises.Retos.Peliculas.Servicios.PeliculaService;

import java.util.ArrayList;
import java.util.List;

import static POOExercises.Retos.Peliculas.CrearPeliculas.listaAlquiler;
import static POOExercises.Retos.Peliculas.CrearPeliculas.listaPeliculas;

public class MenuPeliculas {

    public MenuPeliculas(List<Peliculas> listaPeliculas, List<Alquiler> listaAlquiler) {
        CrearPeliculas.listaPeliculas = listaPeliculas;
        CrearPeliculas.listaAlquiler = listaAlquiler;
    }

    private static void showPeliOptions() {
        System.out.println(
                "1 ⇒ Ingresar pelicula " + " | 2 ⇒ Ver catalogo" + '\n' +
                        "3 ⇒ Rentar pelicula   " + " | 4 ⇒ Peliculas alquiladas" + '\n' +
                        "5 ⇒ Buscar pelicula   " + " | 6 ⇒ Menu retos" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Seleccione una opción");
        return RefactorMain.sc.nextInt();
    }

    public void peliMenu() {

        int opc;

        do {
            showPeliOptions();
            opc = selectOption();
            System.out.println();
            showOptions(opc);
        } while (opc != 6);

    }

    private void showOptions(int opc) {
        switch (opc) {
            case 1://Ingresar pelicula
                for (int x = 0; x < 1; x++) {
                    PeliculaService peliculaService = new PeliculaService();
                    System.out.println("Ingrese la pelicula #" + (x + 1));
                    System.out.println();
                    peliculaService.crearPelicula();
                    listaPeliculas.add(peliculaService);
                }
                System.out.println();
                break;
            case 2://Ver catalogo
                for (int x = 0; x < listaPeliculas.size(); x++) {
                    System.out.println(listaPeliculas.get(x).toString());
                }
                break;
            case 3://Rentar pelicula
                System.out.println("Cuantas peliculas desea Alquilar");
                int numeroPelis = RefactorMain.sc.nextInt();
                System.out.println();

                for (int x = 0; x < numeroPelis; x++) {
                    AlquilerService alquiler = new AlquilerService();
                    alquiler.crearAlquiler();
                    if (alquiler.ComprobarPelicula((ArrayList<Peliculas>) listaPeliculas)) {
                        listaAlquiler.add(alquiler);
                        alquiler.precioAlquiler((ArrayList<Alquiler>) listaAlquiler);
                    } else {
                        System.out.println("La pelicula no se encuentra disponible.");
                    }
                }
                break;
            case 4://Peliculas alquiladas
                for (int x = 0; x < listaAlquiler.size(); x++) {
                    System.out.println(listaAlquiler.get(x).toString());
                }
                break;
            case 5://Buscar pelicula
                //Se le pasan los ArrayList como parametros al MenuBuscar
                MenuBuscarPelicula buscarPelicula = new MenuBuscarPelicula();
                buscarPelicula.searchMenu();
                break;
            case 6:
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}

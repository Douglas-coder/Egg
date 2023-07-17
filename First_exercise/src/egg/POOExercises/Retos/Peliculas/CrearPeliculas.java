package egg.POOExercises.Retos.Peliculas;

import egg.POOExercises.Retos.Peliculas.Entidades.Alquiler;
import egg.POOExercises.Retos.Peliculas.Entidades.Peliculas;
import egg.POOExercises.Retos.Peliculas.Menu.MenuPeliculas;

import java.util.ArrayList;
import java.util.List;


public class CrearPeliculas {

    public static List<Peliculas> listaPeliculas = new ArrayList<>();
    public static List<Alquiler> listaAlquiler = new ArrayList<>();

    public static void mostrarMenu(){
        MenuPeliculas peliculasMenu = new MenuPeliculas(listaPeliculas,listaAlquiler);
        peliculasMenu.peliMenu();
    }

    /*  public void menuPeliculas() {

        Scanner sc = new Scanner(System.in);
        int continuar = 1;
        ArrayList<egg.POOExercises.Retos.Peliculas.Entidades.Peliculas> listaPeliculas = new ArrayList<>();
        ArrayList<Alquiler> listaAlquiler = new ArrayList<>();

        while (continuar == 1) {

            System.out.println("Por favor indique que desea hacer:");
            System.out.println("1- Ingresar pelicula");
            System.out.println("2- Ver catalogo");
            System.out.println("3- Rentar pelicula");
            System.out.println("4- Peliculas alquiladas");
            System.out.println("5- Buscar Pelicula");
            int menu = sc.nextInt();
            System.out.println("");

            sc.nextLine();

            switch (menu) {
                case 1:
                    for (int x = 0; x < 1; x++) {
                        PeliculaService peliculaService = new PeliculaService();
                        System.out.println("Ingrese la pelicula #" + (x + 1));
                        peliculaService.crearPelicula();
                        listaPeliculas.add(peliculaService);
                    }
                    continue;
                case 2:
                    for (int x = 0; x < listaPeliculas.size(); x++) {
                        System.out.println(listaPeliculas.get(x).toString());
                    }
                    continue;
                case 3:
                    System.out.println("Cuantas peliculas desea Alquilar");
                    int numeroPelis = sc.nextInt();

                    for (int x = 0; x < numeroPelis; x++) {
                        AlquilerService alquiler = new AlquilerService();
                        System.out.println("Que pelicula desea alquilar");
                        alquiler.crearAlquiler();
                        if (alquiler.ComprobarPelicula(listaPeliculas)) {
                            listaAlquiler.add(alquiler);
                            alquiler.precioAlquiler(listaAlquiler);
                        } else {
                            System.out.println("La pelicula no se encuentra disponible.");
                        }
                    }
                    break;
                case 4:
                    for (int x = 0; x < listaAlquiler.size(); x++) {
                        System.out.println(listaAlquiler.get(x).toString());
                    }
                    break;
                case 5:

                    System.out.println("Como desea buscar la pelicula:");
                    System.out.println("1- Por titulo");
                    System.out.println("2- Por Genero");
                    System.out.println("3- Por alquiler");
                    int buscar = sc.nextInt();

                    sc.nextLine();

                    switch (buscar) {
                        case 1:
                            System.out.println("Ingrese el titulo de la pelicula que desea buscar");
                            String tituloPelicula = sc.nextLine();

                            for (int x = 0; x < listaPeliculas.size(); x++) {
                                if ((Objects.equals(listaPeliculas.get(x).getTitulo(), tituloPelicula))) {
                                    System.out.println("La pelicula si se encuentra.");
                                } else {
                                    System.out.println("La pelicula no se encuentra.");
                                }
                            }
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Ingrese el genero de la pelicula que desea buscar");
                            String generoPelicula = sc.nextLine();

                            for (int x = 0; x < listaPeliculas.size(); x++) {
                                if ((Objects.equals(listaPeliculas.get(x).getGenero(), generoPelicula))) {
                                    System.out.println("Titulo: " + listaPeliculas.get(x).getTitulo());
                                } else {
                                    System.out.println("La pelicula no se encuentra.");
                                }
                            }
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println("Por favor ingrese el titulo de la pelicula");
                            String pelicula = sc.nextLine();

                            for (int x = 0; x < listaAlquiler.size(); x++) {
                                if ((Objects.equals(listaAlquiler.get(x).getPeliculaAlquilada(), pelicula))) {
                                    System.out.println(listaAlquiler.get(x).toString());
                                } else {
                                    System.out.println("La pelicula ingresada no se encuentra alquilada");
                                }
                            }
                            break;
                    }

            }

            System.out.println("Para continuar (1)");
            System.out.println("Para salir (0)");
            continuar = sc.nextInt();

        }

    }*/

}

package egg.POOExercises.BonusExercises;

import egg.POOExercises.Sentidad.Peliculas.Peliculas;
import egg.POOExercises.Servicio.AlquilerService;
import egg.POOExercises.Servicio.PeliculaService;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MenuPelis {

    public void getMenuPelis(){

        Scanner sc = new Scanner(System.in);
        int continuar = 1;
        ArrayList<PeliculaService> peli = new ArrayList<>();
        ArrayList<AlquilerService> alqui = new ArrayList<>();


        while (continuar == 1){

            System.out.println("Por favor indique que desea hacer:");
            System.out.println("1- Ingresar pelicula");
            System.out.println("2- Ver catalogo");
            System.out.println("3- Rentar pelicula");
            System.out.println("4- Peliculas alquiladas");
            System.out.println("5- Buscar Pelicula");
            int menu = sc.nextInt();
            System.out.println("");

            switch (menu){
                case 1:
                    for (int x = 0; x < 1; x++){
                        PeliculaService peliculas = new PeliculaService();
                        System.out.println("Ingrese la pelicula #" + (x + 1));
                        peliculas.getServicioPeliculas();
                        peli.add(peliculas);
                    }
                    break;
                case 2:
                    for (int x = 0; x < peli.size(); x++){
                        System.out.println(peli.get(x).mostrarPeliculasCreadas());
                    }
                    break;
                case 3:
                    System.out.println("Cuantas peliculas desea Alquilar");
                    int numeroPelis = sc.nextInt();

                    for (int x = 0; x < numeroPelis; x++){
                        AlquilerService alquiler = new AlquilerService();
                        System.out.println("Que pelicula desea alquilar");
                        alquiler.servicioAlquiler();
                        if (alquiler.ComprobarPelicula(peli)){
                            alqui.add(alquiler);
                        }else {
                            System.out.println("La pelicula no se encuentra disponible.");
                        }
                    }
                    break;
                case 4:
                    for (int x =0; x < alqui.size(); x++){
                        System.out.println(alqui.get(x).mostrarPeliculasAlquiladas());
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el titulo de la pelicula que desea buscar");
                    String tituloPelicula = "";
                    tituloPelicula = sc.nextLine();

                    for (int x = 0; x < peli.size(); x++){
                        if (Objects.equals(peli.get(x), tituloPelicula)){
                            boolean esta = true;
                            System.out.println(esta);
                        }else {
                            System.out.println("La pelicula no se encuentra.");
                        }
                    }
                    break;

            }

            System.out.println("Para continuar (1)");
            System.out.println("Para salir (0)");
            continuar = sc.nextInt();

        }

    }


}

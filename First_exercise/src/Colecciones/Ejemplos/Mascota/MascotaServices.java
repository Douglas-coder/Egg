package Colecciones.Ejemplos.Mascota;

import Colecciones.Main;

import java.util.ArrayList;
import java.util.List;

public class MascotaServices {

    private List<Mascota> mascotas;

    public MascotaServices() {
        this.mascotas = new ArrayList<>();
    }

    public Mascota crearMascotas() {
        System.out.println("Introduce el nombre");
        String nombre = Main.sc.next();
        System.out.println("Introduce el apodo");
        String apodo = Main.sc.next();
        System.out.println("Introduce el tipo");
        String tipo = Main.sc.next();

        Mascota m = new Mascota(nombre, apodo, tipo);

        mascotas.add(m);

        return m;

    }

    public void mostrarMascotas() {
        System.out.println("Las mascotas actuales de la lista son:" + '\n');
        for (Mascota show : mascotas) {
            System.out.println(show.toString() + '\n');
        }
        System.out.println("Cantidad = " + mascotas.size());
    }

    /*
     *Crea mascotas, TODOS kiro
     * @param cantidad equivale a la cantidad de nascotas a crear y añadir a la
     * lista
     * */
    public void fabricaKiro(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Kiro", "Gordo", "Gato"));
        }
    }

    /*
    *
    * Crea mascotas pidiendo por teclado
    * @param cantidad
    * */
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascotas();
            //System.out.println(mascotaCreada.toString());
        }
    }

}

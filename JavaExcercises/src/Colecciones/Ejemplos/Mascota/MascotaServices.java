package Colecciones.Ejemplos.Mascota;

import Colecciones.Main;
import Colecciones.Utilities.Comparadores;

import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println();

        return new Mascota(nombre, apodo, tipo);

    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {

        System.out.println("Las mascotas actuales de la lista son:" + '\n');
        for (Mascota show : mascotas) {
            System.out.println(show.toString() + '\n');
        }
        System.out.println("Cantidad = " + mascotas.size() + '\n');

    }

    public void mostrarMascotasOrdenadas() {
        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
        mostrarMascotas();
    }

    public void desordenarListaMascotas() {
        Collections.shuffle(mascotas);
        mostrarMascotas();
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
    public void fabricaMascota(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascotas();

            agregarMascota(mascotaCreada);

            //System.out.println(mascotaCreada.toString());
        }

    }

//TODO Añadir Tray and Catch
    /*public void actualizarMascota(int index) {

        Mascota m = mascotas.get(index);

        m.setNombre("Simon");

    }*/

    public void actualizarMascota(int index) {
        if (index <= mascotas.size() - 1) {
            System.out.println("***** Actualizar *****");
            Mascota m = crearMascotas();
            mascotas.set(index, m);
        } else {
            System.out.println("Fallo al actualizar, el indice es erroneo");
        }
    }

    public void eliminarMascota(int index) {
        if (index <= mascotas.size() - 1) {
            mascotas.remove(index);
        } else {
            System.out.println("Fallo al eliminar, el indice es erroneo");
        }
    }

    public void eliminarPorNombre(String nombre) {

        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombre)) {
                mascotas.remove(i);
            }
        }

    }

}

package Colecciones.BonusExercises.CodigosPostales;

import Colecciones.Main;

import java.util.HashMap;
import java.util.Map;

public class PaisesServices {

    HashMap<Integer, Paises> listaPaises = new HashMap<>();

    public Paises crearPaises() {
        System.out.println("Ingresa el codigo postal");
        int codigo = Main.sc.nextInt();
        System.out.println("Ingresa el pais");
        String nombre = Main.sc.next();
        System.out.println("Ingresa la ciudad");
        String ciudad = Main.sc.next();

        return listaPaises.put(codigo, new Paises(codigo, nombre, ciudad));
    }

    public void mostrarPaises() {
        System.out.println(
                "--------------------" + '\n' +
                        "Los paises son: " + '\n'
        );
        for (Map.Entry<Integer, Paises> entry : listaPaises.entrySet()) {
            System.out.println(
                    "Codigo postal: " + entry.getKey() + '\n' +
                            entry.getValue().toString()
            );
        }
        System.out.println("--------------------" + '\n');
    }

    public void fabricaPaises() {
        String salir;

        listaPaises.put(55412, new Paises(55412, "Colombia", "Itagui"));
        listaPaises.put(2000, new Paises(2000, "Argentina", "Rosario"));
        listaPaises.put(90302, new Paises(90302, "Ecuador", "Guayaqui"));
        listaPaises.put(20220, new Paises(20220, "Brasil", "Rio de Janeiro"));
        listaPaises.put(1611258, new Paises(1611258, "Chile", "Vallenar Quebrada El Jilguero"));
        listaPaises.put(69000, new Paises(69000, "Brasil", "Manaos"));
        listaPaises.put(1050, new Paises(1050, "Venezuela", "Caracas"));
        listaPaises.put(15083, new Paises(15083, "Peru", "Breña"));
        listaPaises.put(1428, new Paises(1428, "Paraguay", "Asuncion"));

        do {
            crearPaises();

            System.out.println("Desea agregar otro pais? (S/N)");
            salir = Main.sc.next();
            System.out.println();
        } while (!salir.equalsIgnoreCase("N"));

    }

    public void mostrarPorCodigo() {
        System.out.println("Por favor ingrese el codigo postal");
        int codigo = Main.sc.nextInt();

        if (listaPaises.containsKey(codigo)) {
            System.out.println(listaPaises.get(codigo));
        } else {
            System.out.println("El codigo postal '" + codigo + "' no se encuentra en la lista" + '\n');
        }
    }

    public void eliminarPaises() {
        String salir;

        System.out.println("Se eliminaran 3 paises");

        do {
            for (int i = 0; i < 3; i++) {
                System.out.println("Por favor ingrese el codigo postal del " + (i + 1) + " pais que desea eliminar");
                int codigo = Main.sc.nextInt();

                if (listaPaises.containsKey(codigo)) {
                    listaPaises.remove(codigo);
                    System.out.println("El pais se elimino correctamente" + '\n');
                } else {
                    System.out.println("El codigo postal '" + codigo + "' no coincide con ninguno de la lista" + '\n');
                    i = i - 1;
                }
            }

            System.out.println("Desea eliminar otros 3 paises? (S/N)");
            salir = Main.sc.next();
            System.out.println();
        } while (!salir.equalsIgnoreCase("N"));

    }

}

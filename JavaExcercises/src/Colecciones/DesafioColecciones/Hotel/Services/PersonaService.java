package Colecciones.DesafioColecciones.Hotel.Services;

import Colecciones.DesafioColecciones.Hotel.Entities.PersonaHotel;
import Colecciones.Main;

import java.util.HashSet;

public class PersonaService {

    HashSet<PersonaHotel> listaPersonaHotels = new HashSet<>();

    public PersonaHotel crearPersona() {
        System.out.println("Ingrese el DNI");
        int dni = Main.sc.nextInt();
        System.out.println("Ingrese el nombre");
        String nombre = Main.sc.next();
        System.out.println("Ingrese la edad");
        int edad = Main.sc.nextInt();
        System.out.println("Ingrese el pais");
        String pais = Main.sc.next();

        return new PersonaHotel(dni, nombre, edad, pais);
    }

    public void agregarPersonas(PersonaHotel p) {
        listaPersonaHotels.add(p);
    }

    public void mostrarPersonas() {
        for (PersonaHotel aux : listaPersonaHotels) {
            System.out.println(aux.toString());
        }
    }

    public void fabricaPersonas(int num) {

        /*listaPersonaHotels.add(new PersonaHotel(1037639137,"Douglas",28,"Colombia"));
        listaPersonaHotels.add(new PersonaHotel(1037639109,"Yilber",28,"Colombia"));
        listaPersonaHotels.add(new PersonaHotel(1388713863,"Ana",12,"Colombia"));*/

        for (int i = 0; i < num; i++) {
            System.out.println("Persona #" + (i + 1));
            PersonaHotel crearPersonas = crearPersona();
            agregarPersonas(crearPersonas);
        }
    }

}

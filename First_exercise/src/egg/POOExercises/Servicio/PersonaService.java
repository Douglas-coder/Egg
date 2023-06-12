package egg.POOExercises.Servicio;

import egg.POOExercises.SEntidad.Persona;

import java.util.Scanner;

public class PersonaService {

    /*
    ?Crear Persona
    ?Mostrar Persona
    */

    public Persona crearPersona() {

        Scanner sc = new Scanner(System.in);

        Persona personaCompleta = new Persona();

        System.out.println("Ingrese el nombre de la persona");

        personaCompleta.setName(sc.next());

        return personaCompleta;

    }

}

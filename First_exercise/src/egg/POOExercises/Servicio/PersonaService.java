package egg.POOExercises.Servicio;

import egg.POOExercises.SEntidad.PersonasGuia;

import java.util.Scanner;

public class PersonaService {

    /*
    ?Crear Persona
    ?Mostrar Persona
    */

    public PersonasGuia crearPersona() {

        Scanner sc = new Scanner(System.in);

        PersonasGuia personasGuiaCompleta = new PersonasGuia();

        System.out.println("Ingrese el nombre de la persona");

        personasGuiaCompleta.setName(sc.next());

        return personasGuiaCompleta;

    }

}

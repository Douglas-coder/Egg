package POOExercises.PracticalExercises.Servicios;

import POOExercises.PracticalExercises.Persona;

import java.util.ArrayList;

public class PersonaService {

    ArrayList<Persona> personas = new ArrayList<>();
    int cont = 0;
    int cont2 = 0;
    int cont3 = 0;
    int cont4 = 0;
    int cont5 = 0;

    public PersonaService() {
        ingresarDatos();
    }

    public void ingresarDatos() {

        for (int x = 0; x < 4; x++) {
            //Crear(Instanciar) el objeto dentro del for para crear 1 objeto cada ciclo for(iteracion)
            Persona persona = new Persona();
            System.out.println("Persona numero: " + (x + 1));
            persona.crearPersona();
            personas.add(persona);
        }
        for (int x = 0; x < personas.size(); x++) {
            System.out.println(personas.get(x).mostrarDatos());
        }
        for (int x = 0; x < personas.size(); x++) {
            if (personas.get(x).calcularIMC() < 0) {
                cont++;
            } else if (personas.get(x).calcularIMC() == 0) {
                cont2++;
            } else if (personas.get(x).calcularIMC() > 0) {
                cont3++;
            }
        }
        for (int x = 0; x < personas.size(); x++) {
            if ((personas.get(x).esMayorDeEdad())) {
                cont4++;
            } else {
                personas.get(x).esMayorDeEdad();
                cont5++;
            }
        }

    }

    @Override
    public String toString() {
        return "👇🏼👇🏼Personas con deficit de peso👇🏼👇🏼 " + cont + '\n' +
                "👍🏼👍🏼Personas con peso ideal👍🏼👍🏼 " + cont2 + '\n' +
                "👆🏼👆🏼Personas con sobre peso👆🏼👆🏼 " + cont3 + '\n' +
                "👴🏼👵🏼Personas mayores de edad👴🏼👵🏼 " + cont4 + '\n' +
                "👦🏼👧🏼Personas menores de edad👦🏼👧🏼 " + cont5 + '\n';
    }

}

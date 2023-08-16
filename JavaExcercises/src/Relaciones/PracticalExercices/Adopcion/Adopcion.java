package Relaciones.PracticalExercices.Adopcion;

public class Adopcion {

    public void datosAdopcion() {

        Perro perro1 = new Perro("Pitufo", "Schnauzer", 4, "Pequeño");
        Perro perro2 = new Perro("Simon", "Schnauzer", 5, "Pequeño");
        Persona persona1 = new Persona("Yilber", "Calderon", 28, 1037639, null);
        Persona persona2 = new Persona("Juan", "Alvarez", 30, 1015292, null);
        Persona persona3 = new Persona("Douglas", "Jaramillo", 28, 4381304, null);

        persona1.adoptar(perro1);
        persona2.adoptar(perro2);

        persona1.showInfo();
        System.out.println("--------------------" + '\n');
        persona2.showInfo();
        System.out.println("--------------------" + '\n');
        persona3.showInfo();
        System.out.println("--------------------" + '\n');

    }

}

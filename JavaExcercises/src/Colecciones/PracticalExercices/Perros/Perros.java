package Colecciones.PracticalExercices.Perros;

public class Perros {

    PerrosServices perrosServices = new PerrosServices();
    private String nombre;
    private String raza;

    public Perros(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public Perros() {
        perrosServices.fabricaPerros();
        perrosServices.eliminarPerro();
    }

    @Override
    public String toString() {
        return "⩶⩶⩶⩶⩶⩶⩶⩶⩶⩶" + '\n' +
                "Nombre: " + nombre + '\n' +
                "Raza: " + raza + '\n' +
                "⩶⩶⩶⩶⩶⩶⩶⩶⩶⩶" + '\n';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}

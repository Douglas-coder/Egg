package Colecciones.BonusExercises.CantanteFamoso;

public class CantanteFamoso {

    private String nombre;
    private String disco;

    public CantanteFamoso(String nombre, String disco) {
        this.nombre = nombre;
        this.disco = disco;
    }

    public CantanteFamoso() {
    }

    @Override
    public String toString() {
        return "Nombre cantante: " + nombre + '\n' +
                "Disco mas vendido: " + disco + '\n';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
}

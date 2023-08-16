package Relaciones.PracticalExercices.RuletaDeAgua;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador #" + id;
        this.mojado = false;
    }

    public boolean disparo(RevolverDeAgua revolver) {
        System.out.print(nombre + " se apunta 😖🔫 y dispara. ");
        if (revolver.mojar()) {
            mojado = true;
            return true;
        } else {
            System.out.println(" No pasa nada 😆");
            revolver.siguienteChorro();
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
}

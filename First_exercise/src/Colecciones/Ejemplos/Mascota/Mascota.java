package Colecciones.Ejemplos.Mascota;

public class Mascota {

    MascotaServices mascotaServices = new MascotaServices();
    private String nombre;
    private String apodo;
    private String tipo;
    private String raza;

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    public Mascota() {
        mascotaServices.fabricaKiro(3);

        mascotaServices.fabricaMascota(2);

        mascotaServices.mostrarMascotas();
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre +
                ", Apodo = " + apodo +
                ", Tipo = " + tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

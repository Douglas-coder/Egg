package Colecciones.Ejemplos.Mascota;

public class Mascota {

    MascotaServices mascoServ = new MascotaServices();
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

        mascoServ.fabricaKiro(2);
        mascoServ.fabricaMascota(1);
        mascoServ.mostrarMascotas();
        mascoServ.mostrarMascotasOrdenadas();
        mascoServ.actualizarMascota(1);
        mascoServ.desordenarListaMascotas();
        //mascoServ.eliminarMascota(0);
        mascoServ.eliminarPorNombre("Simon");
        mascoServ.mostrarMascotasOrdenadas();

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

package egg.POOExercises.Sentidad.Gym;

import java.util.Objects;

public class Cliente {

    private int id;
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String objetivo;

    public Cliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
    }

    public Cliente() {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id && edad == cliente.edad && Double.compare(cliente.altura, altura) == 0 && Double.compare(cliente.peso, peso) == 0 && Objects.equals(nombre, cliente.nombre) && Objects.equals(objetivo, cliente.objetivo);
    }


    public int hashCode() {
        return Objects.hash(id, nombre, edad, altura, peso, objetivo);
    }


    public String toString() {
        return "id=" + id + '\n' +
                "nombre= " + nombre + '\n' +
                "edad= " + edad + '\n' +
                "altura= " + altura + '\n' +
                "peso= " + peso + '\n' +
                "objetivo= " + objetivo + '\n' +
                "________________________________";
    }

}

package Colecciones.DesafioColecciones.Hotel.Entities;

import java.util.Objects;

public class Persona {

    private int dni;
    private String nombre;
    private int edad;
    private String  pais;

    public Persona(int dni, String nombre, int edad, String pais) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return  "DNI: " + dni + '\n' +
                "Nombre: " + nombre + '\n' +
                "Edad: " + edad + '\n' +
                "Pais: " + pais + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    public Persona() {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

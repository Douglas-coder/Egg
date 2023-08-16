package Colecciones.DesafioColecciones.Hotel.Entities;

import java.util.Objects;

public class Room {

    private int numHabitacion;
    private int cantPersonas;

    public Room(int numHabitacion, int cantPersonas) {
        this.numHabitacion = numHabitacion;
        this.cantPersonas = cantPersonas;
    }

    public Room() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return numHabitacion == room.numHabitacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numHabitacion);
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }
}

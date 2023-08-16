package Relaciones.PracticalExercices.RuletaDeAgua;

import java.util.Random;

public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public RevolverDeAgua() {
    }

    public void llenarRevolver() {
        Random random = new Random();
        posicionActual = random.nextInt(6) + 1;
        posicionAgua = random.nextInt(6) + 1;
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual % 6) + 1;
    }

    @Override
    public String toString() {
        return "------------------------------" + '\n' +
                "Posicion actual: " + posicionActual + '\n' +
                "Posicion agua: " + posicionAgua + '\n' +
                "------------------------------" + '\n';
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
}

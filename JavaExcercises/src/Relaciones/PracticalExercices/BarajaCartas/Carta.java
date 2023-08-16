package Relaciones.PracticalExercices.BarajaCartas;

public class Carta {

    private int numero;
    private Palo palo;

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Carta() {
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    enum Palo {
        ESPADA, BASTO, ORO, COPA
    }
}

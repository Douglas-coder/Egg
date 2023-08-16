package Relaciones.PracticalExercices.BarajaCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private List<Carta> cartas = new ArrayList<>();
    private List<Carta> pozo = new ArrayList<>();

    public Baraja(int numerosCartas) {
        for (int i = 1; i < numerosCartas; i++) {
            for (Carta.Palo palo : Carta.Palo.values()) {
                if (i != 8 && i != 9) {
                    cartas.add(new Carta(i, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (!cartas.isEmpty()) {
            Carta carta = cartas.remove(0);
            pozo.add(carta);
            return carta;
        } else {
            System.out.println("No hay mas cartas en la baraja");
            return null;
        }
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int cant) {
        List<Carta> cartasDadas = new ArrayList<>();
        if (cartasDisponibles() >= cant) {
            for (int i = 0; i < cant; i++) {
                cartasDadas.add(siguienteCarta());
            }
        } else {
            System.out.println("No hay suficientes cartas");
        }
        return cartasDadas;
    }

    public void cartasMonton() {
        if (!pozo.isEmpty()) {
            System.out.println("Cartas en el pozo:");
            for (Carta carta : pozo) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No hay ninguna carta en el pozo");
        }
    }

    public void mostrarBaraja() {
        System.out.println("Cartas en baraja");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

}

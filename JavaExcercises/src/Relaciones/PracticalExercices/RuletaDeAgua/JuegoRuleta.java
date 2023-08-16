package Relaciones.PracticalExercices.RuletaDeAgua;

import java.util.List;

public class JuegoRuleta {

    private List<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public JuegoRuleta(List<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void llenarJuego() {
        revolver.llenarRevolver();
    }

    public void ronda() {
        for (Jugador jugador : jugadores) {
            if (jugador.disparo(revolver)) {
                System.out.println("💦 Se mojo 😰" + '\n');
                return;
            }
        }
    }

}

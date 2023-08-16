package Relaciones.PracticalExercices.RuletaDeAgua;

import java.util.ArrayList;

public class EmpezarJuego {

    public void run() {

        int numJugadores = 6;
        ArrayList<Jugador> jugadores = new ArrayList<>();

        for (int i = 1; i < numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        RevolverDeAgua revolverDeAgua = new RevolverDeAgua();
        JuegoRuleta juego = new JuegoRuleta(jugadores, revolverDeAgua);
        juego.llenarJuego();
        juego.ronda();

    }

}

package Colecciones.DesafioColecciones.Hotel.Services;

import Colecciones.DesafioColecciones.Hotel.Entities.PersonaHotel;
import Colecciones.DesafioColecciones.Hotel.Entities.ReservaHotel;
import Colecciones.DesafioColecciones.Hotel.Entities.Room;
import Colecciones.DesafioColecciones.Hotel.Menu.RoomMenu;
import Colecciones.Main;

import java.util.HashSet;

public class ReservaServices {

    HashSet<ReservaHotel> listaReservaHotels = new HashSet<>();
    PersonaService persona = new PersonaService();
    RoomMenu roomMenu = new RoomMenu();
    Room room = new Room();

    public ReservaHotel crearReservas() {
        int cont = 1;

        int id = cont++;
        int numHabitacion = room.getNumHabitacion();
        int canPersona = room.getCantPersonas();
        System.out.println(
                "Ingrese la fecha inicial de la reserva" + '\n' +
                        "Dia / Mes / Año"
        );
        int diaI = Main.sc.nextInt();
        int mesI = Main.sc.nextInt();
        int anioI = Main.sc.nextInt();
        System.out.println(
                "Ingrese la fecha final de la reserva" + '\n' +
                        "Dia / Mes / Año"
        );
        int diaF = Main.sc.nextInt();
        int mesF = Main.sc.nextInt();
        int anioF = Main.sc.nextInt();

        return new ReservaHotel(id, numHabitacion, canPersona, diaI, mesI, anioI, diaF, mesF, anioF);
    }

    public void agregarReserva(ReservaHotel r) {
        listaReservaHotels.add(r);
    }

    public void mostrarReservas() {
        System.out.println("Las reservas actuales son:" + '\n');
        for (PersonaHotel aux : persona.listaPersonaHotels) {
            System.out.println(aux);
        }
        for (ReservaHotel aux : listaReservaHotels) {
            System.out.println(aux);
        }
    }

    public void fabricarReservas() {
        String salir;
        do {
            for (int i = 0; i < 1; i++) {
                roomMenu.menuRoom();
                persona.fabricaPersonas(room.getCantPersonas());
                ReservaHotel hacerReservaHotel = crearReservas();
                agregarReserva(hacerReservaHotel);
            }
            System.out.println("Desea realizar otra reserva? (S/N)");
            salir = Main.sc.next();
            System.out.println();
        } while (!salir.equalsIgnoreCase("N"));

    }

}

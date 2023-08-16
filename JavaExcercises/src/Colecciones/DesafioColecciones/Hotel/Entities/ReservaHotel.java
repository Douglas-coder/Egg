package Colecciones.DesafioColecciones.Hotel.Entities;

public class ReservaHotel {

    private int id;
    private int numHabitacion;
    private int cantPersonas;
    private int diaInicial;
    private int mesInicial;
    private int anioInicial;
    private int diaFinal;
    private int mesFinal;
    private int anioFinal;

    public ReservaHotel(int id, int numHabitacion, int cantPersonas, int diaInicial, int mesInicial, int anioInicial, int diaFinal, int mesFinal, int anioFinal) {
        this.id = id;
        this.numHabitacion = numHabitacion;
        this.cantPersonas = cantPersonas;
        this.diaInicial = diaInicial;
        this.mesInicial = mesInicial;
        this.anioInicial = anioInicial;
        this.diaFinal = diaFinal;
        this.mesFinal = mesFinal;
        this.anioFinal = anioFinal;
    }

    public ReservaHotel() {
    }

    @Override
    public String toString() {
        return "ID: " + id + '\n' +
                "Numero habitación: " + numHabitacion + '\n' +
                "Cantidad personas: " + cantPersonas + '\n' +
                "Fechas de la reserva: " + '\n' +
                diaInicial + " / " + mesInicial + " / " + anioInicial + '\n' +
                diaFinal + " / " + mesFinal + " / " + anioFinal + '\n';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDiaInicial() {
        return diaInicial;
    }

    public void setDiaInicial(int diaInicial) {
        this.diaInicial = diaInicial;
    }

    public int getMesInicial() {
        return mesInicial;
    }

    public void setMesInicial(int mesInicial) {
        this.mesInicial = mesInicial;
    }

    public int getAnioInicial() {
        return anioInicial;
    }

    public void setAnioInicial(int anioInicial) {
        this.anioInicial = anioInicial;
    }

    public int getDiaFinal() {
        return diaFinal;
    }

    public void setDiaFinal(int diaFinal) {
        this.diaFinal = diaFinal;
    }

    public int getMesFinal() {
        return mesFinal;
    }

    public void setMesFinal(int mesFinal) {
        this.mesFinal = mesFinal;
    }

    public int getAnioFinal() {
        return anioFinal;
    }

    public void setAnioFinal(int anioFinal) {
        this.anioFinal = anioFinal;
    }
}

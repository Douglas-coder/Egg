package egg.POOExercises.Sentidad.Figuras;

public class Cubo {

    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return 12 * lado;
    }

    public double getArea() {
        return 6 * lado * lado;
    }

    public double getVolumen() {
        return lado * lado * lado;
    }

}

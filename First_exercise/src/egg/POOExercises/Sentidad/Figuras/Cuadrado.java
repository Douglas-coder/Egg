package egg.POOExercises.Sentidad.Figuras;

public class Cuadrado {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return 4 * lado;
    }

    public double getArea() {
        return lado * lado;
    }

}

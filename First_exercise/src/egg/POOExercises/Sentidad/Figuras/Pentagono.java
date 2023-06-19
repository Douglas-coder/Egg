package egg.POOExercises.Sentidad.Figuras;

public class Pentagono {

    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return 5 * lado;
    }

    public double getApotema() {

        return lado / (2 * Math.tan(Math.PI / 5));

    }

    public double getArea() {
        return (getPerimetro() * getApotema()) / 2;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}

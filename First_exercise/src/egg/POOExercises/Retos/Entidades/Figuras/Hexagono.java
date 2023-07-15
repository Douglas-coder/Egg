package egg.POOExercises.Retos.Entidades.Figuras;

public class Hexagono {

    private double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return 6 * lado;
    }

    public double getHipotenusa() {
        return Math.pow(lado, 2);
    }

    public double getCateto() {
        return Math.pow((lado / 2), 2);
    }

    public double getApotema() {
        return Math.sqrt((getHipotenusa() - getCateto()));
    }

    public double getArea() {
        return (getPerimetro() * getApotema()) / 2;
    }

}

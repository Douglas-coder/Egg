package egg.POOExercises.Retos.Entidades.Figuras;

public class Rombo {

    private double diagonal1;
    private double diagonal2;
    private double lado;

    public Rombo(double lado, double diagonalRom1, double diagonalRom2) {
        this.lado = lado;
        this.diagonal1 = diagonalRom1;
        this.diagonal2 = diagonalRom2;
    }

    public double getArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    public double getPerimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

}

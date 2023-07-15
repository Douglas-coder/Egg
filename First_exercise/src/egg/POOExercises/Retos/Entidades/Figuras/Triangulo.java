package egg.POOExercises.Retos.Entidades.Figuras;

public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

        if (lado1 == lado2 && lado2 == lado3) {
            tipo = "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            tipo = "Isósceles";
        } else {
            tipo = "Escaleno";
        }
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double getArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

}

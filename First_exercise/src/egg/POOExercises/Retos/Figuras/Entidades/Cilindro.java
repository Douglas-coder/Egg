package egg.POOExercises.Retos.Figuras.Entidades;

public class Cilindro {

    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getArea() {
        return 2 * Math.PI * radio * (radio + altura);
    }

    public double getVolumen() {
        return Math.PI * radio * radio * altura;
    }

}

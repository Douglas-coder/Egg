package Colecciones.BonusExercises.ArrayNumeros;

public class ArrayNumeros {

    ArrayNumerosServices numeros = new ArrayNumerosServices();
    private int numero;

    public ArrayNumeros(int numero) {
        this.numero = numero;
    }

    public ArrayNumeros() {
        numeros.fabricarNumeros();
        System.out.println();
        numeros.mostrarNumeros();
        System.out.println("La suma de los numeros ingresados es: ");
        numeros.sumaNumeros();
        System.out.println("El promedio de los numeros ingresados es: ");
        numeros.promedioNumeros();
    }

    @Override
    public String toString() {
        return "Numero: " + numero + '\n';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

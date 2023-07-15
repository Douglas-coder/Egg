package egg.POOExercises.PracticalExercises;

/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/

public class Matematica {

    private double num1;
    private double num2;

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Matematica() {
        setNum1(Math.random() * 100);
        setNum2(Math.random() * 100);
    }

    //?Metodo para hallar el numero mayor
    public double devolverMayor() {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }

    }

    //?Metodo para calcular la potencia
    public double calcularPotencia() {

        double mayor = devolverMayor();
        double menor = (mayor == num1) ? num2 : num1;
        mayor = Math.round(mayor);
        menor = Math.round(menor);

        return Math.pow(mayor, menor);

    }

    //?Metodo para calcular la raiz
    public double calcularRaiz() {

        double mayor = devolverMayor();
        double menor = (mayor == num1) ? num2 : num1;
        menor = Math.abs(menor);

        return Math.sqrt(menor);

    }

    @Override
    public String toString() {
        return "Numero 1: " + num1 + '\n' +
                "Numero 2: " + num2 + '\n' +
                "El mayor es: " + devolverMayor() + '\n' +
                "La potencia del mayor elevada al menor es: " + calcularPotencia() + '\n' +
                "La raiz cuadrada del menor es: " + calcularRaiz() + '\n';
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}

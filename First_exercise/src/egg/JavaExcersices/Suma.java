package egg.JavaExcersices;

import java.util.Scanner;

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/
public class Suma {

    Scanner leer = new Scanner(System.in);
    int mun1;
    int num2;

    public Suma(Scanner leer, int mun1, int num2) {
        this.leer = leer;
        this.mun1 = mun1;
        this.num2 = num2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getMun1() {
        return mun1;
    }

    public void setMun1(int mun1) {
        this.mun1 = mun1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

package egg.POOExercises.PracticalExercises.Banco;

import java.util.Scanner;

public class MenuBanco extends CuentaBancaria {

    private static Scanner sc = new Scanner(System.in);

    public  void bankMenu(){

        int opc;

        do {
        showBankOptions();
        opc = selectOption();
        System.out.println();
        options(opc);
        }while (opc != 6);

    }

    private static void showBankOptions(){
        System.out.println(
                        "1 ⇒ Ingresar monto    " + " | 2 ⇒ Retirar saldo" + '\n' +
                        "3 ⇒ Extraccion rapida " + " | 4 ⇒ Consultar saldo" + '\n' +
                        "5 ⇒ Consultar datos   " + " | 6 ⇒ Menu ejercicios practicos" + '\n'
        );
    }

    private static int selectOption(){
        System.out.println("Seleccione una opción");
        return sc.nextInt();
    }

    private void options(int opc){
        switch (opc){
            case 1:
                ingresarSaldo();
                break;
            case 2:
                retirarSaldo();
                break;
            case 3:
                extraccionRapida();
                break;
            case 4:
                consultarSaldo();
                break;
            case 5:
                consultarDatos();
                break;
            case 6:
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}

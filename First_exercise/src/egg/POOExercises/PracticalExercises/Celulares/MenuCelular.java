package egg.POOExercises.PracticalExercises.Celulares;

import java.util.Scanner;

public class MenuCelular extends Celular {

    private static Scanner sc = new Scanner(System.in);

    public  void celularMenu(){

        int opc;

        do {
            showCelularOptions();
            opc = selectOption();
            System.out.println();
            options(opc);
        }while (opc != 4);

    }

    private static void showCelularOptions(){
        System.out.println(
                        "1 ⇒ Apple   " + " | 2 ⇒ Xiaomi" + '\n' +
                        "3 ⇒ Samsung " + " | 4 ⇒ Menu ejercicios practicos" + '\n'
        );
    }

    private static int selectOption(){
        System.out.println("Seleccione una opción");
        return sc.nextInt();
    }

    private void options(int opc){
        switch (opc){
            case 1:
                setMarca("Apple");
                setModelo("iPhone 14 Pro Max");
                setPrecio(7549);
                setMemoriaRam(6);
                setAlmacenamiento(256);
                getIngresarCodigo();
                System.out.println();
                System.out.println(toString());
                break;
            case 2:
                setMarca("Xiaomi");
                setModelo("Xiaomi Mi 11 Lite");
                setPrecio(1175);
                setMemoriaRam(6);
                setAlmacenamiento(128);
                getIngresarCodigo();
                System.out.println();
                System.out.println(toString());
                break;
            case 3:
                setMarca("Samsung");
                setModelo("Galaxy A54 5G");
                setPrecio(1498);
                setMemoriaRam(6);
                setAlmacenamiento(128);
                getIngresarCodigo();
                System.out.println();
                System.out.println(toString());
                break;
            case 4:
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}

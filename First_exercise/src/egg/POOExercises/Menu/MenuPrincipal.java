package egg.POOExercises.Menu;

import java.security.PrivateKey;
import java.util.Scanner;

//"📋1️⃣2️⃣3️⃣4️⃣🔢🟡🟠🔴🟢"

public class MenuPrincipal {

    private static Scanner sc = new Scanner(System.in);
    private MenuPracticalExercises practical = new MenuPracticalExercises();
    private MenuBonusExercises bonus = new MenuBonusExercises();
    private MenuChallenge challenge = new MenuChallenge();

    public void run(){

        int opc;

        do {
            showOptions();
            opc = selectOption();
            System.out.println();
            options(opc);
        }while (opc != 4);

    }

    private static void showOptions(){
        System.out.println(
                "📋📋📋 MENU 📋📋📋" + '\n' +
                        "1 ⇒ Ejercicios practicos" + '\n' +
                        "2 ⇒ Ejercicios extra" + '\n' +
                        "3 ⇒ Desafíos" + '\n' +
                        "4 ⇒ Salir" + '\n'
        );
    }

    private static int selectOption(){
        System.out.println("Seleccione una opción");
        return sc.nextInt();
    }

    private void options(int opc){
        switch (opc){
            case 1:
                practical.practicalMenu();
                break;
            case 2:
                bonus.bonusMenu();
                break;
            case 3:
                challenge.challengeMenu();
                break;
            case 4:
                System.out.println("👋🏼👋🏼Adios!👋🏼👋🏼");
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}

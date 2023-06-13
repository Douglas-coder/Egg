package egg.ExtraExercises;

import java.util.Scanner;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

public class UnitConverter {

    public static void main(String[] args) {

        //Creacion de variable minutos y Scanner
        Scanner sc = new Scanner(System.in);
        int minutes;

        System.out.println("Please introduce minutes");
        minutes = sc.nextInt();

        //SubFunciones para convertir minutos a horas y dias.
        hourConverter(minutes);
        dayConverter(minutes);

        System.out.println("The " + minutes + " minutes convert to hours are: " + hourConverter(minutes) + " hours");
        System.out.println("The " + minutes + " minutes convert to days are: " + dayConverter(minutes) + " days");

    }

    //********** SubFuncion para convertir los minutos a horas **********
    public static int hourConverter(int minutes) {

        int hour = minutes / 60;

        return hour;
    }

    //********** SubFuncion para convertir los minutos a dias **********
    public static int dayConverter(int minutes) {

        int day = minutes / 1440;

        return day;
    }

}

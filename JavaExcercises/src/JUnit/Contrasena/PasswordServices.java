package JUnit.Contrasena;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordServices extends PasswordValidator {

    //Defino los caracteres especiales y se guardan en una variable
    Pattern especial = Pattern.compile("[~`!@#$%^&*.,;+-/|?<>¡_]");
    //Se usa un Matcher para validar y comprobar que exista alguno de los caracteres antes guardados.
    Matcher hasEspecial = especial.matcher(getPassword());
    char tiene;

    public boolean comprobarLongitud() {
        boolean cumple;
        if (getPassword().length() >= 11) {
            cumple = true;
        } else {
            cumple = false;
        }

        return cumple;
    }

    public boolean comprobarMayus() {
        for (int x = 0; x < getPassword().length(); x++) {
            tiene = getPassword().charAt(x);
            if (Character.isUpperCase(tiene)) {
                setMayus(true);
            }
        }
        return isMayus();
    }

    public boolean comprobarNum() {
        for (int x = 0; x < getPassword().length(); x++) {
            tiene = getPassword().charAt(x);
            if (Character.isDigit(tiene)) {
                setNum(true);
            }
        }
        return isNum();
    }

    //Se hace la logica para validar la existencia de un caracter especial
    public boolean comprobarCaracterEspecial() {
        if (hasEspecial.find()) {
            setEspecial(true);
        }

        return isEspecial();
    }

    public boolean comprobarContrasenia() {

        for (int x = 0; x < getPassword().length(); x++) {
            tiene = getPassword().charAt(x);
            if (Character.isUpperCase(tiene)) {
                setMayus(true);
            }
            if (Character.isDigit(tiene)) {
                setNum(true);
            }
            if (hasEspecial.find()) {
                setEspecial(true);
            }
        }

        if (isMayus() && isNum() && isEspecial()) {
            setCorrectPassword(true);
        } else {
            setCorrectPassword(false);
        }

        return isCorrectPassword();
    }

}

package JUnit.Contrasena;

public class PasswordValidator {

    private int longitud;
    private boolean especial;
    private boolean mayus;
    private boolean num;
    private boolean correctPassword;
    private String password;

    public PasswordValidator(int longitud, boolean especial, boolean mayus, boolean num) {
        this.longitud = longitud;
        this.especial = especial;
        this.mayus = mayus;
        this.num = num;
    }

    public PasswordValidator() {
        this.password = "Douglas123@#$";
        longitud = password.length();
    }

    public boolean isCorrectPassword() {
        return correctPassword;
    }

    public void setCorrectPassword(boolean correctPassword) {
        this.correctPassword = correctPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public boolean isMayus() {
        return mayus;
    }

    public void setMayus(boolean mayus) {
        this.mayus = mayus;
    }

    public boolean isNum() {
        return num;
    }

    public void setNum(boolean num) {
        this.num = num;
    }
}

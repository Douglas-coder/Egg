package egg.JUnit.Contrasena;

public class PasswordValidator {

    private int longitud;
    private char especial;
    private char mayus;
    private int num;
    private String password;

    public PasswordValidator(int longitud, char especial, char mayus, int num) {
        this.longitud = longitud;
        this.especial = especial;
        this.mayus = mayus;
        this.num = num;
    }

    public PasswordValidator() {
        this.password = "Douglas123@";
        longitud = password.length();
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

    public char getEspecial() {
        return especial;
    }

    public void setEspecial(char especial) {
        this.especial = especial;
    }

    public char getMayus() {
        return mayus;
    }

    public void setMayus(char mayus) {
        this.mayus = mayus;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

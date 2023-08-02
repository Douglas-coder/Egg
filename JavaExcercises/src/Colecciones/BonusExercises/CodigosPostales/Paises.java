package Colecciones.BonusExercises.CodigosPostales;

public class Paises {

    private int codigoPostal;
    private String pais;
    private String ciudad;

    public Paises(int codigoPostal, String pais, String ciudad) {
        this.codigoPostal = codigoPostal;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public Paises() {
    }

    @Override
    public String toString() {
        return "Pais: " + pais + '\n' +
                "Ciudad: " + ciudad + '\n';
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}

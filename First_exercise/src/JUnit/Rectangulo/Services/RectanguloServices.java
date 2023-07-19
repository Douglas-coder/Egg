package JUnit.Rectangulo.Services;


import JUnit.Rectangulo.Entities.Rectangulo;

public class RectanguloServices {

    public double calcularArea(Rectangulo r) {
        return r.getAncho() * r.getLargo();
    }

    public double calcularPerimetro(Rectangulo r) {
        return 2 * (r.getAncho() + r.getLargo());
    }

}

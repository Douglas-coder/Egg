package egg.JUnit.CalcularDescuento.Services;

import egg.JUnit.CalcularDescuento.Entities.DiscountCalculator;

public class DiscountServices {
    public double calcularDescuento(DiscountCalculator dc) {
        return dc.getMonto() - (dc.getMonto()* dc.getDiscount());
    }
}

package JUnit.CalcularDescuento.Services;

import JUnit.CalcularDescuento.Entities.DiscountCalculator;

public class DiscountServices {
    public double calcularDescuento(DiscountCalculator dc) {
        return dc.getMonto() - (dc.getMonto() * dc.getDiscount());
    }
}

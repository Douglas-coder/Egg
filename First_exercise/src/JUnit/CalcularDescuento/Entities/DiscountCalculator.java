package JUnit.CalcularDescuento.Entities;

public class DiscountCalculator {

    private double monto;
    private String producto;
    private double discount;

    public DiscountCalculator(double monto, double discount) {
        this.monto = monto;
        this.discount = discount;
    }

    public DiscountCalculator() {
        this.producto = "Coca-cola";
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}

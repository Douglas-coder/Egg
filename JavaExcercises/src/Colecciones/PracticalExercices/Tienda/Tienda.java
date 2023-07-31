package Colecciones.PracticalExercices.Tienda;

public class Tienda {

    private String producto;
    private Integer precio;

    public Tienda(String producto, Integer precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public Tienda() {
    }

    @Override
    public String toString() {
        return "Producto: " + producto + ", Precio: " + precio + '\n';
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}

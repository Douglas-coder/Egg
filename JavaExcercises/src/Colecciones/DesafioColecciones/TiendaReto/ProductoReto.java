package Colecciones.DesafioColecciones.TiendaReto;

public class ProductoReto {

    protected String nombre;
    protected String categoria;
    protected int precio;

    protected int cantInventario;

    public ProductoReto(String nombre, String categoria, int precio, int cantInventario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantInventario = cantInventario;
    }

    public ProductoReto() {
    }

    @Override
    public String toString() {
        return "⩶⩶⩶⩶⩶⩶⩶⩶⩶⩶" + '\n' +
                "Nombre de Producto: " + nombre + '\n' +
                "Categoría: " + categoria + '\n' +
                "Precio: " + precio + '\n' +
                "Cantidad en inventario: " + cantInventario + '\n' +
                "⩶⩶⩶⩶⩶⩶⩶⩶⩶⩶" + '\n';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantInventario() {
        return cantInventario;
    }

    public void setCantInventario(int cantInventario) {
        this.cantInventario = cantInventario;
    }
}

package egg.JUnit.CalcularDescuento.Entities;

import JUnit.CalcularDescuento.Entities.DiscountCalculator;
import JUnit.CalcularDescuento.Services.DiscountServices;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    DiscountServices ds;
    DiscountCalculator dc;

    @BeforeEach
    void setUp() {
        ds = new DiscountServices();
        dc = new DiscountCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest(name = "Producto = {0}")
    @ValueSource(strings = "Coca-cola")
    public void deberiaInizializarConProducto(String producto){
        //assertNotNull(new DiscountCalculator().getProducto());
        assertEquals(producto, dc.getProducto());
    }

    @ParameterizedTest(name = "Monto = {0}, Descuento = {1}, Esperado = {2}")
    @CsvSource(value = {"5000,0.35,3250","5000,0.1,4500","5000,0.5,0","5000,0,5000"})
    public void deberiaCalcularDescuentos(double valor,double descuento,double esperado){
        double monto = valor;
        double discount = descuento;

        assertEquals(esperado, ds.calcularDescuento(new DiscountCalculator(monto,discount)));

/*      assertEquals(3250, ds.calcularDescuento(new DiscountCalculator(5000,0.35)), 0);
        assertEquals(4500, ds.calcularDescuento(new DiscountCalculator(5000,0.1)), 0);
        assertEquals(2500, ds.calcularDescuento(new DiscountCalculator(5000,0.5)), 0);
        assertEquals(5000, ds.calcularDescuento(new DiscountCalculator(5000,0)), 0);*/
    }
}
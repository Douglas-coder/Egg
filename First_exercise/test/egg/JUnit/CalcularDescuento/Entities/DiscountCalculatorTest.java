package egg.JUnit.CalcularDescuento.Entities;

import egg.JUnit.CalcularDescuento.Services.DiscountServices;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    DiscountServices ds;

    @BeforeEach
    void setUp() {
        ds = new DiscountServices();
    }

    @AfterEach
    void tearDown() {
    }

    @Ignore
    @Test
    public void deberiaInizializarConProducto(){
        assertNotNull(new DiscountCalculator().getProducto());
    }

    @Test
    public void deberiaCalcularDescuentos(){
        assertEquals(3250, ds.calcularDescuento(new DiscountCalculator(5000,0.35)), 0);
        assertEquals(4500, ds.calcularDescuento(new DiscountCalculator(5000,0.1)), 0);
        assertEquals(2500, ds.calcularDescuento(new DiscountCalculator(5000,0.5)), 0);
        assertEquals(5000, ds.calcularDescuento(new DiscountCalculator(5000,0)), 0);
    }
}
package egg.JUnit.Entities;

import egg.JUnit.Rectangulo.Entities.Rectangulo;
import egg.JUnit.Rectangulo.Services.RectanguloServices;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    RectanguloServices rs;
    @BeforeEach
    void setUp() {
        rs = new RectanguloServices();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void deberiaInicializarConColor(){
        assertNotNull(new Rectangulo(10,10).getColor());
    }

    @Test
    public void deberiaCalcularArea(){
        assertEquals(100, rs.calcularArea(new Rectangulo(10,10)), 0);
        assertEquals(20, rs.calcularArea(new Rectangulo(4,5)), 0);
        assertEquals(1, rs.calcularArea(new Rectangulo(1,1)), 0);
    }
    @Test
    public void deberiaCalcularPerimetro(){
        assertEquals(40, rs.calcularPerimetro(new Rectangulo(10,10)), 0);
        assertEquals(100, rs.calcularPerimetro(new Rectangulo(20,30)), 0);
        assertEquals(30, rs.calcularPerimetro(new Rectangulo(5,10)), 0);
    }
    @Test
    public void deberiaActivarODesactivar(){
        Rectangulo r = new Rectangulo(5,5);
        assertTrue(r.isActive());
        r.setActive(false);
        assertFalse(r.isActive());
    }

}
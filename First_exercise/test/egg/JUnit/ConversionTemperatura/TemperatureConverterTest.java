package egg.JUnit.ConversionTemperatura;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureServices ts;
    TemperatureConverter tc;

    @BeforeEach
    void setUp() {
        ts = new TemperatureServices();
        tc = new TemperatureConverter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void deberiaCalcularConversionDeTemperaturas(){
        assertEquals(82.4, ts.convertirCelsiusAFahrenheit(new TemperatureConverter(28,0,0)), 0);
        assertEquals(301.15, ts.convertirCelsiusAKelvin(new TemperatureConverter(28,0,0)), 0);
        assertEquals(28, ts.convertirFahrenheitACelsius(new TemperatureConverter(0,82.4,0)), 0);
        assertEquals(301, ts.convertirFahrenheitAKelvin(new TemperatureConverter(0,82.4,0)), 0);
        assertEquals(28, ts.convertirKelvinACelsius(new TemperatureConverter(0,0,301.15)), 0);
        assertEquals(82.4, ts.convertirKelvinAFahrenhait(new TemperatureConverter(0,0,301.15)), 0);
    }
}
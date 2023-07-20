package JUnit.ConversionTemperatura;

public class TemperatureServices {
    public double convertirCelsiusAFahrenheit(TemperatureConverter tc) {
        return tc.getCelsius() * 9 / 5 + 32;
    }

    public double convertirCelsiusAKelvin(TemperatureConverter tc) {
        return tc.getCelsius() + 273.15;
    }

    public double convertirFahrenheitACelsius(TemperatureConverter tc) {
        return Math.round((tc.getFahrenheit() - 32) * 5 / 9);
    }

    public double convertirFahrenheitAKelvin(TemperatureConverter tc) {
        return Math.round((tc.getFahrenheit() + 459.67) * 5 / 9);
    }

    public double convertirKelvinACelsius(TemperatureConverter tc) {
        return tc.getKelvin() - 273.15;
    }

    public double convertirKelvinAFahrenhait(TemperatureConverter tc) {
        return (tc.getKelvin() - 273.15) * 9 / 5 + 32;
    }
}

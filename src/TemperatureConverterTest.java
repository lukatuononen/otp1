import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @org.junit.Test
    public void fahrenheitToCelsius() {
        assertEquals(-17.77777777777778, TemperatureConverter.fahrenheitToCelsius(0), 0.0001);
    }

    @org.junit.Test
    public void celsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.0001);
    }

    @org.junit.Test
    public void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-50));
        assertTrue(TemperatureConverter.isExtremeTemperature(60));
        assertFalse(TemperatureConverter.isExtremeTemperature(0));
    }
}
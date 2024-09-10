package tempcontrolexcercise;

import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @org.junit.Test
    public void fahrenheitToCelsius() {
        assertEquals(-17.77777778, TemperatureConverter.fahrenheitToCelsius(0), 0.01);
    }

    @org.junit.Test
    public void celsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.01);
    }

    @org.junit.Test
    public void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-41));
        assertTrue(TemperatureConverter.isExtremeTemperature(51));
        assertFalse(TemperatureConverter.isExtremeTemperature(0));
    }
}
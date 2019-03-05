package pl.sdacademy.room.oop.temperature;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @Test
    public void testShouldConvertCelsiusToFarenheit(){

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Assert.assertTrue(temperatureConverter.celsiusToFarenheit(10d) == 50);


    }

    @Test
    public void testShouldConvertFarenheitToCelsius(){

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Assert.assertTrue((int)temperatureConverter.farenheitToCelsius(10d) == -12);

    }

}
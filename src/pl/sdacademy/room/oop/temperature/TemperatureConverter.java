package pl.sdacademy.room.oop.temperature;

public class TemperatureConverter {

    public double farenheitToCelsius(Double farenheit){ return (farenheit - 32)* 5/9; }

    public double celsiusToFarenheit(Double celsius){ return (celsius * 1.8) + 32;}


}

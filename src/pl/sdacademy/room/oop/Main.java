package pl.sdacademy.room.oop;

import pl.sdacademy.room.oop.temperature.TemperatureConverter;

public class Main {

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        System.out.println(temperatureConverter.celsiusToFarenheit(10d));
    }




}

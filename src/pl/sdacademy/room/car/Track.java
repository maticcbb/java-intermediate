package pl.sdacademy.room.car;

public class Track {

private Car[] cars;

    public Track(int size) {
        this.cars = new Car[size];
    }

    public void setCarAt(int position, Car car) {
        cars[position] = car;
    }
}

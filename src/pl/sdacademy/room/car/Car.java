package pl.sdacademy.room.car;


public class Car {

    private Engine engine;
    private Wheel[] wheels;
    private String brand;
    private Track tor;
    private int position;

    public Car(Track tor , int position) {
        this.tor = tor;
        tor.setCarAt(position, this);
    }

    public void move(int distance){
        int newPosition = position + distance;

        }

    }




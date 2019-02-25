package pl.sdacademy.room.car;



public class Car {

    private Engine engine;
    private Wheel[] wheels;
    private String brand;


    public Car(Engine engine, Wheel[] wheels, String brand) {
        this.engine = engine;
        this.wheels = wheels;
        this.brand = brand;
    }

    public void move(){
        System.out.printf("Car %s is moving" , brand);
    }
}

package pl.sdacademy.room.animals;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal eats");
    }


    public void move(){
        System.out.println("Animal moves");
    }


}

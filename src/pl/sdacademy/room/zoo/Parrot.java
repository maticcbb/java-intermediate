package pl.sdacademy.room.zoo;

public class Parrot extends Animal {

    public Parrot(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Parrot eats a cookie");
    }

    void talk(){
        System.out.println("Parrot talks");
    }
}

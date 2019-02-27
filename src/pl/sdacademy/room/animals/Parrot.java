package pl.sdacademy.room.animals;

public class Parrot extends Animal {

    public Parrot(){
        super("Polly");
    }

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Parrot flies");
    }

    public void talk(){
        System.out.println("Parrot talks");
    }
}

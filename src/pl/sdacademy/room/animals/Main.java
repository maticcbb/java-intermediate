package pl.sdacademy.room.animals;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant("Dumbo");
        Animal parrot = new Parrot();

      //  elephant.makeASound();
        elephant.eat();
        elephant.move();

      //  parrot.talk();
        parrot.eat();
        parrot.move();
    }
}

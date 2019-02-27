package pl.sdacademy.room.animals;

public class Elephant extends Animal {

    public Elephant(String name) {
        super(name);
    }

    public void makeASound(){
        System.out.printf("Elephant %s makes a sound\n",name);
    }

}

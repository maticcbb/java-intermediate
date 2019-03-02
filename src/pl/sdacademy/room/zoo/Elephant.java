package pl.sdacademy.room.zoo;

public class Elephant extends Animal {

     Elephant(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    Elephant(){
         super("Babar");
    }

//    @Override
//    void eat() {
//        System.out.println("Elephant eats ! ");
//    }

    void makeASound(){
        System.out.println("elephant makes a sound");
    }
}

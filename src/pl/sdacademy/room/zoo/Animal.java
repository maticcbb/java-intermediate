package pl.sdacademy.room.zoo;

abstract class Animal implements Eater, Greeter {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

   public abstract void eat();

   public void sayHi() { System.out.println("Hello, my name is " + name);}

}

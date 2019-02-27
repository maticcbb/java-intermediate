package pl.sdacademy.room.zoo;

abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

   void sayHi() {
       System.out.println("Hello, my name is " + name);
   }

}

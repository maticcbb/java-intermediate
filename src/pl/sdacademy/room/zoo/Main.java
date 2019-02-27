package pl.sdacademy.room.zoo;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(1);

            zoo.add(new Elephant("Dumbo"));
        try {
            zoo.add(new Parrot("Polly"));
        } catch (MaximumCapaciyExceededException e) {
            System.out.println("Yout cannot add more than 1 animal");
        }
          catch (Exception c){
            // TODO: handle generic exception
          }

        zoo.feed();
        System.out.println(zoo.countAllAnimals());

    }
}

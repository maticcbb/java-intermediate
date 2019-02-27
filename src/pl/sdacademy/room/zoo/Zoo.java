package pl.sdacademy.room.zoo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class Zoo {

    //Iterable(jeśli potrzebujemy iterowanie) -> Collection -> List
    // (ArrayList(jest spoko do iterowania po indeksie , najbardziej ogolna nie czas zdobycia danych )  ,
    // LinkedList(nie uzywać do operowania po indeksach)) , Set(jeśli potrzebujemy elementy nie powtarzające sie,HashSet(dobry do wiekszosci zastosowań,)),

    //Map(jeśli potrzebujemy pary klucz i wartość , HashSet(tablica hashująca, hashCode()- intiger ktory jest kodem na indeksie , equals() - )  nie dziedziczy bo żadnym z nich

    private Collection<Animal> animals;
    private int maxCapacity;

    public Zoo() {
        maxCapacity = 10;
        animals = new ArrayList<>();
    }

    public Zoo(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        animals = new ArrayList<>();
    }

    void feed(){
        for(Animal animal : animals){
                animal.eat();
        }
        }

    void add(Animal animal) throws  MaximumCapaciyExceededException{
        if(animals.size() == maxCapacity)
            throw new MaximumCapaciyExceededException("There's no room in this zoo");
            animals.add(animal);
    }

    int countAllAnimals(){
          return animals.size();
    }


    }



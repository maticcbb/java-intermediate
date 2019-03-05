package pl.sdacademy.room.stream.zad7;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Collection<String> names = Arrays.asList( "Mateusz" , "Maciej" , "Wojciech" , "Piotr" , "Ewa" , "Izabela" , "Daria" , "Monika" , "Jan" , "Dominik");

        // Zadanie 7
        System.out.println(names.stream().filter(n -> n.equals("Jan")).collect(Collectors.toList()));

        // Zadanie 8
        System.out.println(names.stream().sorted((n1, n2) -> n1.compareTo(n2)).collect(Collectors.toList()));
    }





}

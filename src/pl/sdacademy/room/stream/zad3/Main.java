package pl.sdacademy.room.stream.zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Jan", "Kasia", "Tomasz", "Daniel", "Karol");
        List<String> result = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        // Zadanie 3
        // result = name.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        // System.out.println(result);

        // Zadanie 4
        // result2 = name.stream().map(s -> s.length()).collect(Collectors.toList());
        // System.out.println(result2);


    }
}
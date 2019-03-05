package pl.sdacademy.room.lambda.zad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Task 1
        List<String> names = Arrays.asList("Marek" , "Maciej" , "Karol" , "Monika" , "Adrianna");
        names.forEach(n -> System.out.println(n));

        // Task 2
        List<Point> persons = Arrays.asList(new Point(1,2),new Point(4,5),new Point(10,22),new Point(8,6),new Point(9,2),new Point(11,5),new Point(4,2),new Point(7,256));
        System.out.println(persons.stream().sorted((n1,n2) -> n1.getX().compareTo(n2.getX())).collect(Collectors.toList()));


    }
}

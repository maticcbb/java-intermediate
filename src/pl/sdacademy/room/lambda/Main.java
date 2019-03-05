package pl.sdacademy.room.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Filter elements that x > 100
        List<Integer> numbers = Arrays.asList(10,20,110,200,1,4,5);
        List<Integer> result = new ArrayList<>();

        result = numbers.stream().filter(element -> element > 100).collect(Collectors.toList());
        System.out.println("Result: " + Arrays.toString(result.toArray()));
    }
}

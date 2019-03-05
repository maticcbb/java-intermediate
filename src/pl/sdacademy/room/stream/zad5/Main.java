package pl.sdacademy.room.stream.zad5;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(new Integer[]{1,4,2,33,1254,1,6,55,22,121,8});

        // Zadanie 5
        System.out.println(numbers.stream().anyMatch(n -> n == 6));
       // Zadanie 6
        System.out.println(numbers.stream().noneMatch(n -> n != 122));
    }
}

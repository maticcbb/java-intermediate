package pl.sdacademy.room.oop.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersList {

    List<Integer> list = new ArrayList<>();

    /**
     * Methode get the numbers as user input and add them to List
     * ,if input is String print a message and if its "c" char, turning off the program
     */
    public void getNumbersFromUser() {

// Better figure

        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a number");
            String next = scanner.next();
            if (next.equals("c")) {
                break;
            }

            try {
                int number = Integer.parseInt(next);
                list.add(number);
                System.out.println(list);
            } catch (NumberFormatException ex) {
                System.out.println("That's not a number !");
            }
        } while (true);


//        Scanner scanner = new Scanner(System.in);
//        int number;
//        boolean flag = true;
//
//        do {
//            System.out.println("Enter a number");
//            while (!scanner.hasNextInt()) {
//                if (scanner.nextLine().equals("c")) {
//                    flag = false;
//                    System.out.println("Exit");
//                    break;
//                } else {
//                    System.out.println("Thats not a number !");
//                }
//            }
//            if (flag) {
//                number = scanner.nextInt();
//                list.add(number);
//                System.out.println(list);
//            }
//        }
//        while (flag);

    }

}


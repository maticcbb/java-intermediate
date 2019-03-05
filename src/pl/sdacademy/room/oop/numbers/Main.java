package pl.sdacademy.room.oop.numbers;

public class Main {
    public static void main(String[] args) {
//       NumbersList numbersList = new NumbersList();
//       numbersList.getNumbersFromUser();
        SumNumbers sumNumbers = new SumNumbers();
        sumNumbers.getNumbers();
        System.out.println(sumNumbers.sum(sumNumbers.returnNumbers()));


        }
    }


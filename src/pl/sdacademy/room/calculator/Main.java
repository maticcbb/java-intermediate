package pl.sdacademy.room.calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.sum(-8, 9);
        } catch (IllegalArgumentException e) {
            System.out.println("Adding -1 and 5 failed");
        }

        try {
            calculator.sum(-2,8 );
        } catch (IllegalArgumentException e) {
            System.out.println("Adding -2 and 8 failed");
        }

    }



}

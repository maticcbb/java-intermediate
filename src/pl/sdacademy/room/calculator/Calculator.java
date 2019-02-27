package pl.sdacademy.room.calculator;

public class Calculator {


   public void sum(int firstNumber , int secondNumber) throws IllegalArgumentException{

       if( firstNumber < 0|| secondNumber < 0) {
           throw new IllegalArgumentException("Only positive argument and no letters");
       }
        System.out.printf("Sum of %d and %d is %d",firstNumber,secondNumber,firstNumber + secondNumber);
    }

}

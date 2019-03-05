package pl.sdacademy.room.oop.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {

   public List<Integer> numList = new ArrayList<>();


    /**
     * Using methode from previously task , getting numbers to list
     * @return
     */
    public List<Integer> getNumbers(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number");
            String next = scanner.next();
            if (next.equals("c")) {
                break;
            }

            try {
                int number = Integer.parseInt(next);
                numList.add(number);
                System.out.println(numList);
            } catch (NumberFormatException ex) {
                System.out.println("That's not a number !");
            }
        } while (true);

        return numList;
    }

    /**
     * Converting List to table of numbers
     * @return
     */

    public int[] returnNumbers(){
        int[] numTable = new int[numList.size()];
        for (int i =0 ; i<numTable.length ; i++){
              numTable[i] = numList.get(i);
        }
        return numTable;
    }

    /**
     * Getting varargs and sum all of the tables
     * @param args
     * @return
     */

    public int sum(int...args){
        int sum = 0 ;
        for(int arg : args){
            sum+=arg;
        }
        return sum;
    }




}

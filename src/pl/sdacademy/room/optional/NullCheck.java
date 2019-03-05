package pl.sdacademy.room.optional;

import java.util.Optional;

public class NullCheck {

    private String colorName;


    // Task 1
   public void nullValidation(){
        Optional<String> opt = Optional.of("Test") ;
       System.out.println(opt.isPresent());
   }

   // Task 2
    public void textValidation(String text){
        Optional<String> opt = Optional.of(text) ;
        System.out.println(opt.map(n -> n.length()));
    }

    // Task 3
    public void colorsConventer(String colorName){

       Optional<String> n = Optional.of(colorName);

    }



}

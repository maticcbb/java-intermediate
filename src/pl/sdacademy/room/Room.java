package pl.sdacademy.room;

public class Room {
   private int width;
   private int height;

    Room(int width, int height) {
        this.width = width;
        this.height = height;
    }



    int calculateArea(){
       return width * height;
   }
}

package pl.sdacademy.room.pojazdy;

public interface Pojazd {
    default  void jedz(){
        System.out.println("Pewien pojazd jedzie");
    }
}

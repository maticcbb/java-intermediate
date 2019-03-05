package pl.sdacademy.room.zad2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyThread extends Thread {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public void run(){
        for(int i = 0 ; i <3 ; i++){
            LocalDateTime ldt = LocalDateTime.now();
            System.out.println(dtf.format(ldt));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Wątek został zatrzymany");
                break;
            }
        }
    }
}

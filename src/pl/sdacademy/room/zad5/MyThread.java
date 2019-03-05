package pl.sdacademy.room.zad5;

public class MyThread extends Thread {
    public void run(){
        System.out.println("Początek przetwarzania");
        for(int i = 1 ; i <=10 ; i++){
            System.out.println( i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Wyjątek został zatrzymany");
            }
        }
        System.out.println("Koniec przetwarzania");
    }
}

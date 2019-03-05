package pl.sdacademy.room.zad4;

public class MyThread extends Thread {
        public void run(){
            for(int i = 1 ; i <=10 ; i++){
                System.out.println( i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Wyjątek został zatrzymany");
                }
            }
        }

}

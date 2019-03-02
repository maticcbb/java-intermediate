package pl.sdacademy.room.threads.ex05;

public class myThread extends Thread {

    @Override
    public void run(){
        for(int i = 0; i < 1000 ; i++){
            Data.counter.addAndGet(1);
        }
    }

}

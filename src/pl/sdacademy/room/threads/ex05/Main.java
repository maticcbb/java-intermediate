package pl.sdacademy.room.threads.ex05;

import pl.sdacademy.room.threads.ex01.MyThread;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i =0 ; i < 10 ; i++){
            executorService.execute(new MyThread());
        }
        Thread.sleep(1000);
        System.out.println(Data.counter);
        executorService.shutdown();
    }
}

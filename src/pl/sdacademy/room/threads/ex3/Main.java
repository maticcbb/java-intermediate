package pl.sdacademy.room.threads.ex3;

import pl.sdacademy.room.threads.ex01.MyThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(15);
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.shutdown();
    }
}

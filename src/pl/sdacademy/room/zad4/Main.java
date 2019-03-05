package pl.sdacademy.room.zad4;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread_1 = new MyThread();
        MyThread myThread_2 = new MyThread();
        myThread_1.start();
        myThread_1.join();
        myThread_2.start();
    }
}

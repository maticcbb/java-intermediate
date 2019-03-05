package pl.sdacademy.room.zad3;

public class Main {
    public static void main(String[] args) {
        MyThread myThread_1 = new MyThread();
        MyThread myThread_2 = new MyThread();
        myThread_1.start();
        myThread_2.start();
    }
}

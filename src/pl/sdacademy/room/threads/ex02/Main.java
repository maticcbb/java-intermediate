package pl.sdacademy.room.threads.ex02;

public class Main {
    public static void main(String[] args) {
        myThread myThread = new myThread();
        Thread thread = new Thread(myThread);
        thread.setName("Wątek ex2");
        thread.start();
    }
}

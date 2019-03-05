package pl.sdacademy.room.lambda.zad.bank;

public class BankAccount {

    private  String name;
    private  Double balance;

    public BankAccount(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }
}

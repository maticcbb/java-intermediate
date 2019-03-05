package pl.sdacademy.room.lambda.zad.bank;

import pl.sdacademy.room.lambda.zad.bank.BankAccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    private String name;
    private String lastName;
    public List<BankAccount> accounts = new ArrayList<>();


    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}

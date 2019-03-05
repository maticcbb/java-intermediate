package pl.sdacademy.room.lambda.zad.bank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person("Jan" , "Nowak");
        p1.accounts.add(new BankAccount("Mbank" , 1255.854d)) ;
        p1.accounts.add(new BankAccount("Aliorbank" , 24255.5000d));
        Person p2 = new Person("Piotr" , "Klimczewski");
        p2.accounts.add(new BankAccount("Mbank" , 341255.854d)) ;
        p2.accounts.add(new BankAccount("Aliorbank" , 28000.98000d));
        Person p3 = new Person("Marek" , "Kowalik");
        p3.accounts.add(new BankAccount("Mbank" , 3241255.854d)) ;
        p3.accounts.add(new BankAccount("Aliorbank" , 89000.98890d));
        Person p4 = new Person("Asia" , "Nowacka");
        p2.accounts.add(new BankAccount("Mbank" , 3555.454d)) ;
        p2.accounts.add(new BankAccount("Aliorbank" , 48000.94800d));
        Person p5 = new Person("Monika" , "Kowalska");
        p2.accounts.add(new BankAccount("Mbank" , 651255.854d)) ;
        p2.accounts.add(new BankAccount("Aliorbank" , 54300.9800d));

        List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);


        //System.out.println( persons.stream().map(n -> n.accounts.get(0).getBalance() + n.accounts.get(1).getBalance()).sorted(n -> n.compareTo(n.doubleValue())).collect(Collectors.toList()));

    }
}

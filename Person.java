import java.util.Scanner;

public class Person {
    private String name;
    private int balance;

    public Person() {
        this.name = "";
        this.balance = 0;
    }

    public Person(String name) {
        this.name = name;
        this.balance = 0;
    }

    public Person(int balance) {
        this.name = "";
        this.balance = balance;
    }

    public Person(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
}

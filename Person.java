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

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        String temp;
        System.out.println("** Ввод данных человека **");
        do {
            System.out.print("Введите имя: ");
            this.name = scanner.next();
        } while (this.name.isEmpty() || !Checking.nameCheck(this.name));
        do {
            System.out.print("Введите баланс: ");
            temp = scanner.next();
        } while (temp.isEmpty() || !Checking.intCheck(temp));
        this.balance = Integer.parseInt(temp);
        System.out.println("Данные успешно введены!\n");
        scanner.close();
    }

    public void output() {
        if (this.name.isEmpty()) {
            System.out.println("Данные о человеке отсутствуют!");
        } else {
            System.out.println("Данные о человеке:");
            System.out.println("-Имя: " + this.name);
            System.out.println("-Баланс: " + this.balance);
        }
    }
}

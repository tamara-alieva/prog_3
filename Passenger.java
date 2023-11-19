import java.util.Scanner;

public class Passenger extends Person {
    private boolean payment_method;

    public Passenger() {
        super();
        this.payment_method = false;
    }

    public Passenger(String name) {
        super(name);
        this.payment_method = false;
    }

    public Passenger(int balance) {
        super(balance);
        this.payment_method = false;
    }

    public Passenger(String name, int balance, boolean method) {
        super(name, balance);
        this.payment_method = method;
    }

    public void setMethod(boolean method) {
        this.payment_method = method;
    }

    public boolean getMethod() {
        return this.payment_method;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        String temp = "";
        System.out.println("** Ввод данных о пассажире: " + this.getName() + " **");
        do {
            System.out.print("Введите способ оплаты (0 - Наличные, 1 - Банковская карта): ");
            while (scanner.hasNextLine())
                temp = scanner.nextLine();
        } while (temp != "0" && temp != "1");
        this.payment_method = Boolean.parseBoolean(temp);
        System.out.println("Данные успешно введены!\n");
        scanner.close();
    }

    @Override
    public void output() {
        System.out.println("Данные о пассажире:");
        System.out.println("-Имя: " + this.getName());
        System.out.println("-Баланс: " + this.getBalance());
        System.out.print("-Способ оплаты: ");
        if (this.getMethod()) {
            System.out.println("Банковская карта\n");
        } else {
            System.out.println("Наличные\n");
        }
    }

    public void takePayment(int payment) {
        int old_balance = this.getBalance();
        this.setBalance(old_balance - payment);
    }
}

import java.util.Scanner;

public class Car {
    private String brand;
    private boolean rate;
    private Fuel fuel;

    public Car() {
        this.fuel = new Fuel();
        this.brand = "";
        this.rate = false;
    }

    public Car(String brand) {
        this.fuel = new Fuel();
        this.brand = brand;
        this.rate = false;
    }

    public Car(boolean rate) {
        this.fuel = new Fuel();
        this.brand = "";
        this.rate = rate;
    }

    public Car(String brand, boolean rate) {
        this.fuel = new Fuel();
        this.brand = brand;
        this.rate = rate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRate(boolean rate) {
        this.rate = rate;
    }

    public String getBrand() {
        return this.brand;
    }

    public boolean getRate() {
        return this.rate;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        String temp;
        System.out.println("** Ввод данных автомобиля **");
        do {
            System.out.print("Введите марку: ");
            this.brand = scanner.next();
        } while (this.brand.isEmpty() || !Checking.nameCheck(this.brand));
        do {
            System.out.print("Введите класс автомобиля (0 - Эконом, 1 - Комфорт): ");
            temp = scanner.next();
        } while (!temp.equals("0") && !temp.equals("1"));
        this.rate = Boolean.parseBoolean(temp);
        System.out.println("Данные успешно введены!\n");
        scanner.close();
    }

    public void output() {
        if (this.brand.isEmpty()) {
            System.out.println("Данные об автомобиле отсутствуют!");
        } else {
            System.out.println("Данные об автомобиле:");
            System.out.println("-Марка: " + this.brand);
            System.out.print("-Класс: ");
            if (this.rate) {
                System.out.println("Комфорт");
            } else {
                System.out.println("Эконом");
            }
        }
    }
}

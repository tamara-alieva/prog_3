import java.util.Scanner;

public class Fuel {
    private boolean capacity;

    public Fuel() {
        this.capacity = false;
    }

    public Fuel(boolean capacity) {
        this.capacity = capacity;
    }

    public void setCapacity(boolean capacity) {
        this.capacity = capacity;
    }

    public boolean getCapacity() {
        return this.capacity;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        String temp;
        System.out.println("** Ввод данных о топливном баке **");
        do {
            System.out.print("Введите заполенность бака (0 - Пустой, 1 - Полный): ");
            temp = scanner.next();
        } while (!temp.equals("0") && !temp.equals("1"));
        this.capacity = Boolean.parseBoolean(temp);
        System.out.println("Данные успешно введены!\n");
        scanner.close();
    }

    public void output() {
        System.out.println("Данные о топливном баке:");
        System.out.print("-Заполненность: ");
        if (this.getCapacity()) {
            System.out.println("Полный\n");
        } else {
            System.out.println("Пустой\n");
        }
    }

    public void fill() {
        this.capacity = true;
    }

    public void empty() {
        this.capacity = false;
    }
}

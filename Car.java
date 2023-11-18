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
}

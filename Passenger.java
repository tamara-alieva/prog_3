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
}

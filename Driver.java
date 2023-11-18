public class Driver extends Person {
    private int experience;
    private int orderAmount;

    public Driver() {
        super();
        this.experience = 0;
        this.orderAmount = 0;
    }

    public Driver(String name) {
        super(name);
        this.experience = 0;
        this.orderAmount = 0;
    }

    public Driver(int balance) {
        super(balance);
        this.experience = 0;
        this.orderAmount = 0;
    }

    public Driver(String name, int balance, int experience, int orderAmount) {
        super(name, balance);
        this.experience = experience;
        this.orderAmount = orderAmount;
    }
}

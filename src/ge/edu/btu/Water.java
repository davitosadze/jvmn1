package ge.edu.btu;

public class Water {
    String customerNumber;
    double amount;

    public Water(String customerNumber, double amount) {
        this.customerNumber = customerNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Water{" +
                "customerNumber=" + customerNumber +
                ", amount=" + amount +
                '}';
    }
}

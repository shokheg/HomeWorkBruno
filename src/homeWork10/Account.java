package homeWork10;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double put(double sum) {
        balance += sum;
        return balance;
    }

    public double withdraw(double sum) {
        if (balance - sum >= 0) {
            balance = balance - sum;
        }
        return balance;
    }

    public double deposit(int yearsNum, double percent) {
        double result = balance;
        for (int i = 0; i < yearsNum; i++) {
            result = (result * (100 + percent)) / 100;
        }
        return result;
    }

    @Override
    public String toString() {
        return customer.getName() + "[" + customer.customerType() + "]" + "{" + customer.getId() + "}:"+balance;
    }
}

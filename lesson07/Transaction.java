public class Transaction {
    /**
     * attribute.
     */
    private String operation;
    private double amount;
    private double balance;
    public static final String WITHDRAW = "withdraw";
    public static final String DEPOSIT = "deposit";

    /**
     * Initialize constructor.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * set operation to a value.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * set amount to a value.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * set balance to a value.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * get operation attribute.
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * get amount attribute.
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     * get balance attribute. 
     * @return
     */
    public double getBalance() {
        return this.balance;
    }
}
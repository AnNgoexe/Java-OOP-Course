import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    /**
     * Attribute of Account class.
     */
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<Transaction>();

    /**
     * Initialize Account object without parameters.
     */
    public Account() {

    }

    /**
     * Initialize Account object with 2 parameters.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Get the account number of the account.
     */
    public long getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Get the balance of the account.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Check the withdrawing action and conduct.
     */
    public void doWithdrawing(double amount) throws InvalidFundingAmountException, InsufficientFundsException {
        if (amount < 0 || amount > 1000) {
            throw new InvalidFundingAmountException(amount);
        }
        if (this.balance - amount < 5000) {
            throw new InsufficientFundsException(amount);
        }
        double initialBalance = this.balance;
        this.balance -= amount;
        if (this instanceof CheckingAccount) {
            Transaction transaction = new Transaction(2, amount, initialBalance, this.balance);
            this.transactionList.add(transaction);
        } else {
            Transaction transaction = new Transaction(4, amount, initialBalance, this.balance);
            this.transactionList.add(transaction);
        }
    }

    /**
     * Check the depositing action and conduct.
     */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        double initialBalance = this.balance;
        this.balance += amount;
        if (this instanceof CheckingAccount) {
            this.balance += amount;
            Transaction transaction = new Transaction(1, amount, initialBalance, this.balance);
            this.transactionList.add(transaction);
        } else {
            Transaction transaction = new Transaction(3, amount, initialBalance, this.balance);
            this.transactionList.add(transaction);
        }
    }

    /**
     * Withdrawing money.
     */
    public abstract void withdraw(double amount);

    /**
     * Depositing money.
     */
    public abstract void deposit(double amount);

    /**
     * Get the transaction history of the account.
     */
    public String getTransactionHistory() {
        String history = "Lịch sử giao dịch của tài khoản ";
        history = history.concat(this.accountNumber + ":\n");
        for (Transaction transaction : transactionList) {
            history = history.concat("- ");
            history = history.concat(transaction.getTransactionSummary() + "\n");
        }
        return history;
    }

    /**
     * Add a new transaction.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * Compare two accounts.
     */
    @Override 
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return this.accountNumber == account.accountNumber;
    }
}
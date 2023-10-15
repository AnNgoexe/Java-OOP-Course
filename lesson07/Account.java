import java.util.ArrayList;

public class Account {
    /**
     * attribute. 
     */
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /**
     * add money to the account.
     */
    private void deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            return;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
    }

    /**
     * withdraw money from the account. 
     */
    private void withdraw(double amount) {
        if (amount > 0) {
            if (amount > this.balance) {
                System.out.println("So tien ban rut vuot qua so du!");
                return;
            } else {
                this.balance = this.balance - amount;
                return;
            }
        } else {
            System.out.println(" So tien ban rut ra khong hop le!");
            return;
        }
    }

    /**
     * money transaction : withdraw or deposit.
     */
    public void addTransaction(double amount, String operation) {
        operation = operation.toLowerCase();
        if (operation.equals(Transaction.DEPOSIT)) {
            this.deposit(amount);
            this.transitionList.add(new Transaction(operation, amount, balance));
        } else if (operation.equals(Transaction.WITHDRAW)) {
            this.withdraw(amount);
            this.transitionList.add(new Transaction(operation, amount, balance));
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * print the list of transaction.
     */
    public void printTransaction() {
        for (int i = 1; i <= transitionList.size(); i++) {
            System.out.print("Giao dich " + i + ": ");
            double amountMoney = transitionList.get(i - 1).getAmount();
            double balanceMoney = transitionList.get(i - 1).getBalance();
            if (transitionList.get(i - 1).getOperation().equals(Transaction.DEPOSIT)) {
                System.out.print("Nap tien $");
            } else {
                System.out.print("Rut tien $");
            }
            System.out.printf("%.2f. So du luc nay: $%.2f.\n", amountMoney, balanceMoney);
        }
    }
}


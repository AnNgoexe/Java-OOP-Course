public class SavingsAccount extends Account {
    /**
     * Initialize SavingsAccount object with 2 parameters.
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Withdrawing money.
     */
    @Override 
    public void withdraw(double amount) {
        if (amount <= 1000 && balance - amount >= 5000) {
            try {
                    this.doWithdrawing(amount);
            } catch (InvalidFundingAmountException e) {
                System.out.println("Số tiền rút ra không hợp lệ");
            } catch (InsufficientFundsException e) {
                    System.out.println("Số dư không hợp lệ");
            }
        }
    }

    /**
     * Depositing money.
     */
    @Override
    public void deposit(double amount) {
        try {
            this.doDepositing(amount);
        } catch(InvalidFundingAmountException e) {
            System.out.println("Số tiền bỏ vào không hợp lệ");
        }
    }
}
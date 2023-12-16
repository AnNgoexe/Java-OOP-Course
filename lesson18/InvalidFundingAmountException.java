public class InvalidFundingAmountException extends BankException {
    public InvalidFundingAmountException(double amount) {
        super("Số tiền vượt quá số dư.");
    }
}
